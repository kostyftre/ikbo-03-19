package laba_6;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;
import javax.swing.*;


public class laba_6 {
    public static Scanner in = new Scanner(System.in);

    static JFrame jFrame = getFrame();
//    static JPanel jPanel = new JPanel();
//
//
//
    public static void main(String[] args) throws Exception {
//        jFrame.add(jPanel);
//        jFrame.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int j;
//
//                j=0+(int)(Math.random()*(6-0+1));
//                if (j==0) {
//                    jPanel.setBackground(Color.blue); }
//                else if (j==2) {
//                    jPanel.setBackground(Color.red);
//                }
//                else if (j==1) {
//                    jPanel.setBackground(Color.black);
//                }
//                else if (j==3) {
//                        jPanel.setBackground(Color.green);
//                }
//                else if (j==4) {
//                        jPanel.setBackground(Color.yellow);
//                }
//                else if (j==5) {
//                    jPanel.setBackground(Color.cyan);
//                }
//                else if (j==6) {
//                    jPanel.setBackground(Color.magenta);
//                }
//
//
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });

        JComponent jComponent = new Mycomponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                Mycomponent.x=e.getX();
                Mycomponent.y=e.getY();
                jComponent.repaint();


            }
        });



    }


    static class Mycomponent extends JComponent{
        public static int x,y;


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            ((Graphics2D)g).drawString("Координаты : "+ x +" "+ y, 190, 240);
            if (x<250 && y<250) ((Graphics2D)g).drawString("Вы находитесь сверху слева", 20, 20);
            if (x>250 && y<250) ((Graphics2D)g).drawString("Вы находитесь сверху справа", 300, 20);
            if (x>250 && y>250) ((Graphics2D)g).drawString("Вы находитесь снизу справа", 300, 450);
            if (x<250 && y>250) ((Graphics2D)g).drawString("Вы находитесь снизу слева", 20, 450);
        }


    }


    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return jFrame;

    }



}
