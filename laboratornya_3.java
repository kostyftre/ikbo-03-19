package laboratornya_3;
import java.util.*;

public class laboratornya_3 {
    public static Scanner in= new Scanner(System.in);
    public static void main(String [] args){
      // dishes();
       dogs();





    }
    public static void dogs (){
        int age;
        String breed, male;
        System.out.println("Поговорим о собаках");
        System.out.println("Напишите информацию о трёх породах собак");

        System.out.println("Введите породу первой собаки");
        breed=in.nextLine();
        System.out.println("Введите возраст(цифрой) первой собаки");
        age=in.nextInt();
        System.out.println("Введите пол первой собаки");
        male=in.nextLine();
        dog_1 dog_1= new dog_1(age,breed,male);

        System.out.println("Введите возраст(цифрой) второй собаки");
        age=in.nextInt();
        System.out.println("Введите породу второй собаки");
        breed=in.nextLine();
        System.out.println("Введите пол второй собаки");
        dog_2 dog_2= new dog_2(age,breed,in.nextLine());

        System.out.println("Введите возраст(цифрой) третьей собаки");
        age=in.nextInt();
        System.out.println("Введите породу третьей собаки");
        breed=in.nextLine();
        System.out.println("Введите пол третьей собаки");
        dog_3 dog_3= new dog_3(age,breed,in.nextLine());


        dog_1.gav();
        dog_2.gav();
        dog_3.gav();
        dog_1.information();
        dog_2.information();
        dog_3.information();

    }
    public static void dishes(){
        System.out.println("Разберем посуду");
        System.out.println("Введите цвет тарелки,цвет чашки и цвет стакана");
        plate plate = new plate(in.nextLine());
        cup cup = new cup(in.nextLine());
        glass glass = new glass(in.nextLine());
        glass.posudamoika();
        glass.colors();
        cup.colors();
        plate.bad_cat();
        plate.colors();
    }

}
