package Vector;

import Models.Student;

public class Tests {
    static Student s1 = new Student();
    static Student s2 = new Student();
    static Student s3 = new Student();

    public static void TestAddEnd() {
        s1.setName("Alex");
        s2.setName("Davi");
        s3.setName("Gomes");

        Vector list = new Vector();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Test add at end:..... " + list);
    }

    public static void TestAddInPosition() {
        s1.setName("Alex");
        s2.setName("Davi");
        s3.setName("Gomes");

        Vector list = new Vector();

        list.add(s1);
        list.add(0, s2);
        list.add(1, s3);

        System.out.println("Test add in position: " + list);
    }

    public static void TestGetInPosition() {
        s1.setName("Alex");
        s2.setName("Davi");

        Vector list = new Vector();

        list.add(s1);
        list.add(s2);

        Student student1 = (Student) list.get(0);
        Student student2 = (Student) list.get(1);

        String result = String.format("Test get in position: student 1 is %s and student 2 is %s", student1, student2);
        System.out.println(result);
    }

    public static void TestRemovePosition() {
        s1.setName("Alex");
        s2.setName("Davi");

        Vector list = new Vector();

        list.add(s1);
        list.add(s2);

        list.remove(0);

        System.out.println("Test remove position: " + list);
    }

    public static void TestHasStudent() {
        s1.setName("Alex");
        s2.setName("Davi");

        Vector list = new Vector();

        list.add(s1);
        list.add(s2);

        boolean hasS2 = list.has(s2);

        System.out.println("Test has student:.... " + hasS2);
    }

    public static void TestListLength() {
        s1.setName("Alex");
        s2.setName("Davi");

        Vector list = new Vector();

        list.add(s1);
        list.add(s2);

        System.out.println("Test list length:.... " + list.length());
    }

    public static void testAll() {
        TestAddEnd();

        TestAddInPosition();

        TestGetInPosition();

        TestRemovePosition();

        TestHasStudent();

        TestListLength();
    }

//    public static void Main(String[] args) {
//        TestAddEnd();
//
//        TestAddInPosition();
//
//        TestGetInPosition();
//
//        TestRemovePosition();
//
//        TestHasStudent();
//
//        TestListLength();
//    }
}
