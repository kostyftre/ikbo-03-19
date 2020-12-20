import java.util.ArrayList;

public class LabClass {

    private final ArrayList<Student> students;

    public LabClass() {
        this.students = new ArrayList<>();
    }

    public void add(Student student){
        students.add(student);
    }

    public void sortByScore() {
        students.sort(Student::compareTo);
    }

    public ArrayList<Student> getList(){return students;}


    public Student find(String studentName) throws StudentNotFoundException {
        Student foundStudent = students.stream().filter((student) -> studentName.equals(student.getName())).findAny().orElse(null);

        if (foundStudent == null) {
            throw new StudentNotFoundException("Student named " + studentName + " not found!");
        }

        return foundStudent;
    }

    @Override
    public String toString() {
        return students.toString();
    }

}
