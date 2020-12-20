import java.util.Scanner;

public class zadanie_7 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        getKey();
    }

    public static void getKey() {
        int s=0;
        while(s!=2) {
            System.out.print("Enter Key ");
            String gg = in.nextLine();

            s++;
            try {
                if (gg.length() != 0) {
                    System.out.println(2 / (gg.length() - 1));
                }
            } catch (Exception e) {
                System.out.println("Придумай ошибку сам");
            }
        }
        System.out.println("Вы с 2 раз не смогли ввести что-то там для чего-то там");
    }


    }
