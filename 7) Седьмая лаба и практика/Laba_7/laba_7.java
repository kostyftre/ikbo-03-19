package laba_7;
import java.util.*;


public class laba_7 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add and show some int's");
         ArrayList<Integer> list = new ArrayList<>(4);
         list.add(56);
         list.add(59);
         list.add(567);
         list.add(5);
         list.add(6);
         System.out.println(list.size());
         for (int x:list){
             System.out.println(x);
         }
         System.out.println("Delete all and add new int's");
         list.clear();
        list.add(586);
        list.add(5096);
        list.add(56177);
        list.add(9);
        list.add(60);
        for (int x:list){
            System.out.println(x);
        }
        System.out.println("Delete number 4");

        list.remove(3);

        for (int x:list){
            System.out.println(x);
        }





    }
}
