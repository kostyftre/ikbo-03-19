package Java_Praktica.practicheskoe_2;
import java.util.*;

public class test_bal {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ball b1 = new ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}

