package Java_Praktica.Laboratornya_2;

public class head {
    int size;

    public head(int size) {
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
        return "head{" +
                " head size=" + size +
                '}';
    }

}
