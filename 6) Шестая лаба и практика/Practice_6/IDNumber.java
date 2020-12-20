public class IDNumber {

    private Student[] uni;
    private int size;

    public IDNumber(int capacity) {
        this.uni = new Student[capacity];
        size = 0;
    }

    public void sort() {
        for (int left = 0; left < uni.length; left++) {
             Student value = uni[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getId() < uni[i].getId()) {
                    uni[i + 1] = uni[i];
                } else {
                   break;
                }
            }
            uni[i + 1] = value;
        }
    }

    public void add(Student student) {
        uni[size] = student;
        size++;
    }


    public Student get(int index) {
        return uni[index];
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            out.append(uni[i].getName()).append("(id=").append(uni[i].getId()).append(")");
            if (i != size - 1) {
                out.append(", ");
            }
        }
        out.append("]");
        return out.toString();
    }
}
