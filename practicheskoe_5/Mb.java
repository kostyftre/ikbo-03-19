package Java_Praktica.Praticheskoe_4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class BorderExample1 extends JFrame {
    JPanel[] pnl = new JPanel[3];
    public int milanScore=0,realScore=0;

    public String Winner(int a, int b){
        if(a>b) return "AC Milan";
        if(b>a) return"Real Madrid";
        return "Ничья";
    }


    public BorderExample1() {

        setLayout(new GridLayout(1, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i]= new JPanel();
            pnl[i].setBackground(new Color(0, 160, 255));
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }
        JButton btn1 = new JButton("AC Milan");
        btn1.setBackground(Color.white);
        JButton btn2 = new JButton("Real Madrid");
        btn2.setBackground(Color.RED);
        btn1.setBorder(new EmptyBorder(5, 5, 5, 5));
        btn2.setBorder(new EmptyBorder(5, 5, 5, 5));

        JLabel label1 = new JLabel("Счёт: 0 X 0", SwingConstants.CENTER);
        JLabel label2 = new JLabel("Последний гол: N/A", SwingConstants.CENTER);
        JLabel label3 = new JLabel("Победитель: N/A", SwingConstants.CENTER);
        label1.setBorder(new EmptyBorder(10, 10, 10, 10));
        label2.setBorder(new EmptyBorder(10, 10, 10, 10));
        label3.setBorder(new EmptyBorder(10, 10, 10, 10));

        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                label1.setText("Result: " + milanScore + " X " + realScore);
                label2.setText("Last Scorer: AC Milan");
                label3.setText("Winner: " + Winner(milanScore, realScore));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btn2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                realScore++;
                label1.setText("Result: " + milanScore + " X " + realScore);
                label2.setText("Last Scorer: Real Madrid");
                label3.setText("Winner: " + Winner(milanScore, realScore));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        pnl[0].add(btn1, BorderLayout.CENTER);
        pnl[2].add(btn2, BorderLayout.CENTER);

        pnl[1].add(label1, BorderLayout.SOUTH);
        //pnl[1].add(btn1,BorderLayout.LINE_START);
        pnl[1].add(label2, BorderLayout.NORTH);
        pnl[1].add(label3, BorderLayout.CENTER);
        setSize(700, 300);

    }

    public static void main(String[] args) {

        new BorderExample1().setVisible(true);
    }
}
