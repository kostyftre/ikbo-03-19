package Java_Praktica.practicheskoe_2_4;

import java.util.*;

public class Tester {
    public static Scanner in = new Scanner(System.in);
    public static void main(String [] args){

        MovableCircle gg= new MovableCircle(1,2,3,4,7);
        MovableRectangle hh = new MovableRectangle(6,7,8,9,2,3);
        System.out.println(gg.toString());
        gg.moveDown();
        System.out.println(gg.toString());
        System.out.println("");
        System.out.println(hh.toString());
        hh.moveLeft();
        System.out.println(hh.toString());




    }
}
