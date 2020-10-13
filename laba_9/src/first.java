import java.util.InputMismatchException;
import java.util.Scanner;

public class first {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        a= in.nextInt();


        try {
            exceptionDemo(a);
        }
        catch (InputMismatchException e){
            System.out.println("Вы ввели не целое число и делите им инт");
        }
        catch (ArithmeticException e) {
            System.out.println("На ноль делиь нельзя");
        }
        finally {
            System.out.println("я в финале");
        }
    }
    public static void exceptionDemo(int a) {
        System.out.println( 2 / a);
    }
}