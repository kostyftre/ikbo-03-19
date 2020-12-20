
public class Number {
    String number, code="";
    int a=0;

    public Number(String number) {
        this.number = number;
    }

    public void vivod(){
        if(number.charAt(0)=='+'){
            for(int i=1;i<number.length()-10;i++){
                code=code+number.charAt(i);
            }
            System.out.print("+"+code + " ");
            for (int i=number.length()-10; i<number.length();i++){
                if(a==3 || a==6) {
                    System.out.print(" ");
                }
                System.out.print(number.charAt(i));
                a++;
            }
            System.out.println(" ");

        }

        else if (number.charAt(0)=='8'){

            System.out.print("+" + "7" + " ");
            for (int i=number.length()-10; i<number.length();i++){
                if(a==3 || a==6) {
                    System.out.print(" ");
                }
                System.out.print(number.charAt(i));
                a++;
            }
            System.out.println(" ");

        }

    }
}
