

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Customer{
    final String firstName, secondName;
    final int age;
    final Address address;
    Customer MATURE_UNKNOWN_CUSTOMER;
    Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }
    public Customer(Scanner sc){
        System.out.println("Введите имя заказчика, его фамилию и возраст");
        this.address = Address.EMPTY_ADDRESS;
        String[] str = sc.nextLine().split(" ");
        this.firstName = str[0];
        this.secondName = str[1];
        this.age = parseInt(str[2]);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", MATURE_UNKNOWN_CUSTOMER=" + MATURE_UNKNOWN_CUSTOMER +
                ", NOT_MATURE_UNKNOWN_CUSTOMER=" + NOT_MATURE_UNKNOWN_CUSTOMER +
                '}';
    }
}
