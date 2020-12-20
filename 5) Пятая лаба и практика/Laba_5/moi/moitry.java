package Laba_5.moi;
import javax.swing.*;
import java.awt.*;


public class moitry {



    public static void main(String[] args) {
        JFrame frame = new JFrame(" Laba_5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Shape shape = new Shape();
        shape.back();
        circle Circle = new circle(6,7,12);
        frame.add(Circle);

        frame.setSize(1000,1000);
        frame.setVisible(true);

    }


}
