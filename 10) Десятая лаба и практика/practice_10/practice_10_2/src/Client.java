public class Client{
    public static void main(String[] args) {
         Chair chair = new;
    }


    public void sit() {
        System.out.println("Вы сели на" + chair );
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}