
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class first {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] sdk) {


        firstandchetire();
        second(sdk);
        third();
        fifth();
    }
    static void second(String[] sdk){
        for (String arg : sdk){
            System.out.println(sdk);
        }
    }
    static void fifth(){
        int a, b=1;
        System.out.println();
        System.out.println("Факториал какого числа ты хочешь найти");
        a=in.nextInt();
        for(int i=1; i<a;i++){
            b*=i;
        }
        System.out.println("Ваш факториал -- " + b);

    }

    static void third() {

        System.out.println("Первые 10 чисел гармонического ряда");
        for (int i = 1; i <= 10; i++) {
            System.out.print(1.0 / i + " ");
        }
    }

    /* static void second(String[] sdk){
         System.out.println();
         for (String arg : sdk){
             System.out.println(arg);
         }
     }*/
    static void firstandchetire() {
        int down = 0, up = 9, g, m = 0;
        int[] mass;
        g = in.nextInt();
        mass = new int[g];
        for (int i = 0; i < g; i++) {
            mass[i] = down + (int) (Math.random() * (up - down + 1));

        }
        for (int i = 0; i < g; i++) {
            m = m + mass[i];
        }
        System.out.println("Symma chisel = " + m);
        System.out.println("Ves massiv");
        for (int i = 0; i < g; i++) {
            System.out.println(mass[i]);
        }
        Arrays.sort(mass);
        System.out.println("Otsortirovanniy massiv");

        for (int i = 0; i < g; i++) {
            System.out.println(mass[i]);
        }
    }

}

