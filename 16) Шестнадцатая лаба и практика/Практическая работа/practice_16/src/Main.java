
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main extends JFrame {
    JPanel p1, p2, p3;
    JLabel input_smth;
    JTextField input;
    JButton enter;
    JLabel output;
    OrdersManager manager;
    boolean man;
    int question;
    Order tmp = null;
    public static void main(String[] args) {
        new Main();
    }

    Main(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        input_smth = new JLabel("<html>Выберите, какой менеджер использовать: на основе хэш-таблицы, <br>или на основе очереди:[1-таблица,другое_число-очередь]:</html>");
        question = 0;
        p1.add(input_smth);
        add(p1);
        p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        input = new JTextField();
        output = new JLabel();
        p2.add(input);
        enter = new JButton();
        enter.setText("enter");
        enter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int num = 1;
                if (manager!=null){
                    if (man){
                        switch(question){
                            case 1:
                                switch(input.getText()){
                                    case "1":
                                        input_smth.setText("<html>Введите тип хранения элементов в заказе<br>[1-на массиве,другое_число-на списке]</html>");
                                        question = 2;
                                        break;
                                    case "2":
                                        input_smth.setText("К какому столику привязан искомый заказ?");
                                        question = 5;
                                        break;
                                    case "3":
                                        input_smth.setText("К какому столику привязан искомый заказ?");
                                        question = 9;
                                        break;
                                    case "4":
                                        output.setText(manager.toString());
                                        break;
                                }
                                break;
                            case 2:
                                if (input.getText().equals("1")){
                                    input_smth.setText("Введите количество товаров:");
                                    question = 3;
                                }
                                else{
                                    tmp = new InternetOrder();
                                    input_smth.setText("На какой столик сделать заказ?(всего 20 столиков)");
                                    question = 4;
                                }
                                break;
                            case 3:
                                num = parseInt(input.getText());
                                tmp = new TableOrder(num);
                                input_smth.setText("На какой столик сделать заказ?(всего 20 столиков)");
                                question = 4;
                                break;
                            case 4:
                                try{
                                    num = parseInt(input.getText());
                                    ((TableOrdersManager)manager).add(num, tmp);
                                    tmp = null;
                                    question = 1;
                                    output.setText(manager.toString());
                                    input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                }
                                catch(TableOrdersManager.IllegalTableNumber exc) {
                                    output.setText("Illegal table number");
                                }
                                break;
                            case 5:
                                num = parseInt(input.getText());
                                ((TableOrdersManager)manager).remove(num);
                                question = 1;
                                output.setText(manager.toString());
                                input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                break;
                            case 6:
                                if (input.getText().equals("1")){
                                    input_smth.setText("Введите количество алкоголя, имя напитка и его цену:");
                                    question = 7;
                                }
                                else{
                                    input_smth.setText("Введите название блюда и его цену:");
                                    question = 8;
                                }
                                break;
                            case 7:
                                tmp.addItem(new Drink(parseDouble(input.getText().split(" ")[0]), DrinkTypeEnum.fromString(input.getText().split(" ")[1]), parseDouble(input.getText().split(" ")[2])));
                                input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                output.setText(manager.toString());
                                question = 1;
                                break;
                            case 8:
                                tmp.addItem(new Dish(input.getText().split(" ")[0], "", parseDouble(input.getText().split(" ")[1])));
                                input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                output.setText(manager.toString());
                                question = 1;
                                break;
                            case 9:
                                num = parseInt(input.getText());
                                tmp = ((TableOrdersManager)manager).getOrder(num);
                                if (tmp!=null){
                                    input_smth.setText("Ваш заказ - напиток, или блюдо?[1-напиток,другое_число-блюдо]");
                                    question = 6;
                                }
                                else{
                                    output.setText("К столику не привязан ни 1 заказ");
                                    input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                    question = 1;
                                }
                                break;
                        }
                    }
                    else{
                        switch (question){
                            case 1:
                                switch(input.getText()){
                                    case "1":
                                        input_smth.setText("<html>Введите тип хранения элементов в заказе<br>[1-на массиве,другое_число-на списке]</html>");
                                        question = 2;
                                        break;
                                    case "2":
                                        input_smth.setText("Основан на очереди - удаляем первый элемент");
                                        ((InternetOrdersManager)manager).remove();
                                        output.setText(manager.toString());
                                        break;
                                    case "3":
                                        input_smth.setText("Какой по счёту элемент изменить?");
                                        question = 4;
                                    case "4":
                                        output.setText(manager.toString());
                                        break;
                                }
                                break;
                            case 2:
                                if (input.getText().equals("1")){
                                    input_smth.setText("Введите количество товаров:");
                                    question = 3;
                                }
                                else{
                                    ((InternetOrdersManager)manager).add(new InternetOrder());
                                    input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                    question = 1;
                                }
                                break;
                            case 3:
                                num = parseInt(input.getText());
                                ((InternetOrdersManager)manager).add(new TableOrder(num));
                                input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                question = 1;
                                break;
                            case 4:
                                num = parseInt(input.getText());
                                if (manager.ordersQuantity()<num || num<1){
                                    System.out.println("Введите количество товаров:");
                                }
                                else{
                                    question = 5;
                                    input_smth.setText("Ваш заказ - напиток, или блюдо?[1-напиток,другое_число-блюдо]");
                                }
                                break;
                            case 5:
                                if (input.getText().equals("1")){
                                    input_smth.setText("Введите количество алкоголя, имя напитка и его цену:");
                                    question = 6;
                                }
                                else{
                                    input_smth.setText("Введите название блюда и его цену:");
                                    question = 7;
                                }
                                break;
                            case 6:
                                manager.getOrders()[num-1].addItem(new Drink(parseDouble(input.getText().split(" ")[0]), DrinkTypeEnum.fromString(input.getText().split(" ")[1]), parseDouble(input.getText().split(" ")[2])));
                                input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                output.setText(manager.toString());
                                question = 1;
                                break;
                            case 7:
                                manager.getOrders()[num-1].addItem(new Dish(input.getText().split(" ")[0], "", parseDouble(input.getText().split(" ")[1])));
                                input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                                output.setText(manager.toString());
                                question = 1;
                                break;
                        }
                    }
                }
                else{
                    if (input.getText().equals("1")){
                        manager = new TableOrdersManager();
                        man = true;
                    }
                    else{
                        manager = new InternetOrdersManager();
                        man = false;
                    }
                    input_smth.setText("<html>Выберите действие<br>1) Добавить новый заказ<br>2) Удалить заказ<br>3) Дополнить заказ<br>4) Вывести все заказы</html>");
                    question = 1;
                }
                input.setText("");
            }
        });
        p2.add(enter);
        add(p2);
        p3 = new JPanel();
        p3.add(output);
        add(p3);

        setVisible(true);
    }
}





















