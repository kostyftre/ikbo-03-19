package ru.mirea.lab1.ru;

public class main {
    public static void main(String[] args) {
        ball bolshoi=new ball("Green","Very big", "JA");
        System.out.println(bolshoi.toString());
        book random= new book("45", "JA", "Platon");
        System.out.println(random.toString());
        platon Platon= new platon("Platon","Bolshoy", "man");
        System.out.println(Platon.toString());
    }


}
