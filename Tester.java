package Java_Praktica.practicheskoe_2_4;

import java.util.*;

public class Tester {
    public static Scanner in = new Scanner(System.in);
    public static void main(String [] args){

        MovableCircle gg= new MovableCircle(1,2,3,4,7);
        MovablePoint ss = new MovablePoint(1,2,6,7);
        System.out.println(gg.toString());
        System.out.println(ss.toString());

    }
}
