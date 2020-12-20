import java.util.*;



public class main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Stack first= new Stack();
        Stack second = new Stack();
        Stack first_help= new Stack();
        Stack second_help = new Stack();
        Stack pause = new Stack();
        int a, b, l, k=1, rand=35, zapis;

        int [] mass= new int[]{6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14};
        for (int i=0;i<36;i++){
            zapis=0+(int)(Math.random()*(rand-0+1));
            a=0+(int)(Math.random()*(1-0+1));
            if (a==0 && first.size()<18){
                first.push(mass[zapis]);
            }
            else if (a==1 && second.size()<18) second.push(mass[zapis]);
            rand--;
        }
        System.out.println(second);
        System.out.println(first);


        while(first.size()!=0 || second.size()!=0){
            if (second.size()==0) break;
            if (first.size()==0) break;
            System.out.println("Раунд: " + k);
            k++;
            if(first.size()==1 && first_help.size()!=0){
                for (int i=0; i<=first_help.size(); i++){
                    first.push(first_help.pop());
                }
            }
            if(second.size()==1 && second_help.size()!=0){
                for (int i=0; i<=second_help.size(); i++){
                    second.push(second_help.pop());
                }
            }

            l=1;
            while (l!=0) {
                a = (int) first.pop();
                b = (int) second.pop();

                if (a > b){
                    first_help.push(a);
                    first_help.push(b);
                    l=0;
                    if (pause.size()!=0){
                        for (int i=0; i<=pause.size();i++){
                            first_help.push(pause.pop());
                        }

                    }

                }
                else if (b>a){
                    second_help.push(a);
                    second_help.push(b);
                    l=0;
                    if (pause.size()!=0){
                        for (int i=0; i<=pause.size();i++){
                            second_help.push(pause.pop());
                        }

                    }
                }
                else if(b==a){
                    pause.push(a);
                    pause.push(b);
                    l=0;
                }

            }

        }
        if(first.size()==0) System.out.println("Победитель : игрок номер 2" );
        else if(second.size()==0) System.out.println("Победитель : игрок номер 1" );

    }

}
