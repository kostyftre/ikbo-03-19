package Ja;
import java.util.Collection;
import java.util.Scanner;

public class Tester {
public  static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        WaitList <Integer> list = new WaitList<>();
        System.out.println("Add some elements in first list");
        list.add(2014);
        list.add(1997);
        list.add(1961);
        list.add(1954);
        list.add(1921);
        System.out.println("Show how much elements is here:");
        System.out.println(list.toString());
        System.out.println("Delete some elements");
        list.remove();
        list.remove();
        System.out.println(list);

        System.out.println("");
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("");

        System.out.println("Now we will push some elements in the second list which have only five positions to imput");
        BoundedWaitList <Integer> list_second= new BoundedWaitList<>(5);
        list_second.add(1337);
        list_second.add(404);
        list_second.add(69);
        list_second.add(777);
        list_second.add(666);
        list_second.add(11092001);
        System.out.println(list_second.toString());
        System.out.println("Let's delete some numbers");
        list_second.remove();
        list_second.remove();
        System.out.println(list_second);

        System.out.println("");
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("");

        System.out.println("Let's invite some integers in our List_third company");
        UnfairWaitList <Integer> list_third = new UnfairWaitList<>();

        list_third.add(505);
        list_third.add(1917);
        list_third.add(1991);
        list_third.add(1812);
        list_third.add(1941);
        System.out.println("We will check our integers");
        System.out.println(list_third);
        System.out.println("Remove int from the first position to the last position");
        list_third.moveToBack(0);
        System.out.println(list_third);







    }
}
