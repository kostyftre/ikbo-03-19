package Java_Praktica.laba_4;

public class car implements getPrice,Nameable {
    String m,p;
    public car(String m,String p) {
        this.m=m;
        this.p=p;
    }

    @Override
    public void getName() {
        System.out.println("Название вашей машины: "+m);
    }

    @Override
    public void getPrices() {
        System.out.println("Цена вашей машины: "+p);
    }
}
