import java.util.*;

public class test {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Stack gg = new Stack();
        Stack bn = new Stack();

        gg.push(11);
        gg.push(34);
        bn.push(56);
        bn.push(44444);
        for(int i=0; i<=bn.size();i++){
            gg.push(bn.pop());
        }
        System.out.println(gg);
        System.out.println(bn);



    }
}
