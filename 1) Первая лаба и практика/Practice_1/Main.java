package ru.mirea.LESSON_1.PRACTIK;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("bob", "grey", "Platon");
        Book book1 = new Book("Metro 2033", "Dmitriy Gluchovskiy", 2005);
        Ball ball1 = new Ball("red", "small", "bik");

        Tester test = new Tester();

        test.print(dog1);
        test.print(book1);
        test.print(ball1);
    }
}