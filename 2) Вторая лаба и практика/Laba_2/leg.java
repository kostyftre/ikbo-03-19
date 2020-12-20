package Java_Praktica.Laboratornya_2;

public class leg {
    int size;

    public leg(int size) {
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
        return "leg{" +
                "leg size=" + size +
                '}';
    }
}
