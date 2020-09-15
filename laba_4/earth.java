package Java_Praktica.laba_4;

public class earth implements Nameable,getPrice{
    String m,p;

    public earth(String m, String p) {
        this.m = m;
        this.p = p;
    }

    @Override
    public void getName() {
        System.out.println("Название вашей планеты: "+m);
    }

    @Override
    public void getPrices() {
        System.out.println("Цена вашей планеты : "+p);
    }
}
