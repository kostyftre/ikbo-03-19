package Java_Praktica.Laboratornya_2;

import java.util.*;

public class Laba_2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        circle();
        human_spawn();
        books();



    }
    static void circle(){
        System.out.println("Введите радиус и имя вашей окружности");
        call_laba_2 circle=new call_laba_2(in.nextInt(),in.nextLine());
        System.out.println(circle.toString());
    }

    static public void human_spawn(){
        System.out.println("Создадим человека. Введите размеры ног, головы и рук");
        leg leg = new leg(in.nextInt());
        head head = new head(in.nextInt());
        hand hand = new hand(in.nextInt());
        System.out.println(hand.wave());;
        System.out.println(hand.toString());
        System.out.println(head.toString());
        System.out.println(leg.toString());
    }
    static void books(){
        System.out.println();
        System.out.println("Создадим книгу, введите информацию о книге");
        int g, l;
        String f, k;
        System.out.println("Имя автора: ");
        k=in.nextLine();
        System.out.println("Название книги: ");
        f=in.nextLine();
        System.out.println("Кол-во страниц: ");
        g=in.nextInt();
        System.out.println("Год написания: ");
        l=in.nextInt();

        book book= new book(g,f,k,l);
        System.out.println(book.toString());

    }



}


