import java.util.Scanner;

public class main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("/// 1");

        Person pr1 = new Person("Ilya", "Belikov", "Vladislavovich");
        Person pr2 = new Person("Mr.Grey");
        Person pr3 = new Person("Anastasia","Mrs.Grey");

        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());

        Address_second_a address1 = new Address_second_a("Russia Moscovskay_oblast Moscow Arbat 666 777 999 ");
        address1.splitter();
        System.out.println(address1.toString());

        System.out.println("/// 2");

        Address_second_b address2 = new Address_second_b("NeRussia;NeMoscovskay_oblast;NeMoscow;NeArbat;Ne666;Ne777;Ne999");
        address2.TokenizerS();
        System.out.println(address2.toString());

        Address_second_b address3 = new Address_second_b("NeRussia,NeMoscovskay_oblast,NeMoscow,NeArbat,Ne666,Ne777,Ne999");
        address3.TokenizerS();
        System.out.println(address3.toString());

        System.out.println("///3");

        Shirt shirt = new Shirt();
        shirt.vivod();

        System.out.println("///4");

        Number number1 = new Number("+79175655655");
        number1.vivod();

        Number number2 = new Number("89175655655");
        number2.vivod();

        System.out.println("///5");





    }



}
