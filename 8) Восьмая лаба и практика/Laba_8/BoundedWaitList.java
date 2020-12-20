package Ja;

public class BoundedWaitList<E> extends WaitList<E>{
    private int captivity;


    public BoundedWaitList(int captivity) {
        this.captivity = captivity;
    }

    public int getCaptivity() {
        return captivity;
    }

    public void add(E element){
        if(content.size()<captivity){
            content.add(element);
        }
        else System.out.println("Your list is overflow");

    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "captivity=" + captivity +
                ", content=" + content +
                '}';
    }
}
