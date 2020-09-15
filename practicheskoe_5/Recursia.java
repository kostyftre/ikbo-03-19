package Java_Praktica.practicheskoe_5;

import  java.util.*;

public class Recursia {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n, o;
        String gg,hh;
//        System.out.println("Введите число n для задания 2"); // Дано натуральное число n. Выведите все числа от 1 до n.
//        n=in.nextInt();
//        exercize_2(n,0);
//        System.out.println("Введите 2 числа для задания 3"); // Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
//        n=in.nextInt();
//        o=in.nextInt();
//        if(n<=o) exercize_3_1(n,o+1);
//        else exercize_3_2(n,o-1);
        System.out.println("Введите число для задания 15"); // Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
        n=in.nextInt();
        exercize_14(n);
        System.out.println("Введите слово для задания 8"); // Дано число n, десятичная запись которого не содержит нулей. Получите число, записанное теми же цифрами, но в противоположном порядке.
        gg=in.nextLine();
        hh=in.nextLine();
        System.out.println(exercize_8(hh));


    }

    public static String exercize_8(String str){
        if (str.length() <= 1)  return "Да, это паллиндром";

        if (str.charAt(0) != str.charAt(str.length() - 1))  return "Нет, это не паллиндром";

        return exercize_8(str.substring(1, str.length() - 1));

    }

    public static int exercize_14 (int a){
        if(a/10!=0) {
            System.out.print(a%10+ " ");
            exercize_14(a/10);
        }
        else System.out.println(a);
        return a;

    }

    public static int exercize_3_1(int a, int b){
        if(a==b) return a;
        System.out.println(a);
        return (exercize_3_1(a+1,b));
    }
    public static int exercize_3_2(int a, int b){
        if(a==b) return b;
        System.out.println(a);
        return exercize_3_2(a-1,b);

    }

    public static int exercize_2(int a, int b){
           if(b==a) {
               return a;
           }
           System.out.println(b+1);
           return (exercize_2(a, b + 1));



    }

}
