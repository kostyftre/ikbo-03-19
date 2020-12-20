package Java_Praktica.Laboratornya_2;

public class hand {
    int size;

    public hand(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "hand{" +
                "hand size=" + size +
                '}';
    }


    public static String wave(){
        return("Вам машет рукой человек");
    }

}
