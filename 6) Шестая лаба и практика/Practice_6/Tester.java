import java.util.Arrays;
import java.util.Random;

public class Tester {

    private static int a;

    public static Student getStudent() {
        Random random = new Random();
        return new Student(random.nextInt(500),
                random.nextInt(100) % 5,
                random.nextInt(100) % 5,
                random.nextInt(100) % 5,
                "name " + (a++),
                "group " + (a % 4));
    }

    public static void main(String[] args) {

        System.out.println(" ----------------- 1 -----------------");
        IDNumber arr1 = new IDNumber(10);
        for (int i = 0; i < 10; i++) {
            Student student = getStudent();
//            System.out.println(student);
            arr1.add(student);
        }
        System.out.println(arr1);
        arr1.sort();
        System.out.println(arr1);

        System.out.println(" ----------------- 2 -----------------");
        Student[] arr2 = new Student[10];

        for (int i = 0; i < 10; i++) {
            Student student = getStudent();
//            System.out.println(student);
            arr2[i] = student;
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(arr2));

        System.out.println(" ----------------- 3 -----------------");
        Student[] student1 = new Student[5];
        Student[] student2 = new Student[5];

        for (int i = 0; i < 5; i++) {
            student1[i] = getStudent();
            student2[i] = getStudent();
        }
        Arrays.sort(student1, new SortingStudentsByGPA());
        Arrays.sort(student2, new SortingStudentsByGPA());

        System.out.println("#1:   " + Arrays.toString(student1));
        System.out.println("#2:   " + Arrays.toString(student2));

        System.out.println("#(1 + 2):   " + Arrays.toString(mergeSort(student1, student2)));

    }

    public static Student[] mergeSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getGpa() < a2[j].getGpa()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }

}