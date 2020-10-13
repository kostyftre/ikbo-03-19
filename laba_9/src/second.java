import java.util.Scanner;

public class second {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String gg, kk;
        gg="";
        System.out.println(printMessage(gg));

    }

    public static boolean printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
        return false;
    }
    public static String getDetails(String key) {
        if(key.length() == 0) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key; }
}
