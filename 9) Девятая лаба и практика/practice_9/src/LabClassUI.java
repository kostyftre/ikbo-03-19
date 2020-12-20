import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame{

    LabClass sClass;




        JButton button = new JButton("Найти учащегося");
        JTextField input = new JTextField("", 5);
        JButton button1 = new JButton("Сортировка");
        JLabel label = new JLabel("input");

        public LabClassUI(LabClass s){
            super("Simple Example");
            this.setBounds(100,100,250,250);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.setLayout(new GridLayout(2, 3, 2, 2));
            container.add(label);
            container.add(input);
            button.addActionListener(new ButtonEventListner());
            container.add(button);

        }
        class ButtonEventListner implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String message= "";
                message+="Ваш учащийся : " + (input.getText())+"\n";
                JOptionPane.showMessageDialog(null,message,"Output", JOptionPane.PLAIN_MESSAGE);

            }
        }


}
