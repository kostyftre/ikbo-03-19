import java.util.Scanner;

public class LabClassDriver {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws StudentNotFoundException {
        LabClass sClass = new LabClass();

        sClass.add(new Student("Michail",48));
        sClass.add(new Student("Micha",4));
        sClass.add(new Student("Mich",8));
        sClass.add(new Student("Mi",84));
        sClass.add(new Student("Chail",7));

//        System.out.println(sClass.getList());
//        sClass.sortByScore();
//        System.out.println(sClass.getList());
//        System.out.println( sClass.find("Mi"));
        LabClassUI UI = new LabClassUI();
        UI.setVisible(true);
    }
}
