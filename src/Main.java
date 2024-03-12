import Vector.Vector;
import Models.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.setName("Alex");
        s2.setName("Davi");
        s3.setName("Gomes");
        s4.setName("asdfjk");

        Vector studentList = new Vector();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(1, s3);

        boolean result = studentList.has(s4);

        System.out.println(result);

//        Tests tests = new Tests();
//
//        tests.testAll();
    }
}