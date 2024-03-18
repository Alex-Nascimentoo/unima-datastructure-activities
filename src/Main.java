import Vector.Vector;
import Models.Student;

public class Main {
    public static void main(String[] args) {
        String[] nameList = new String[]{
            "Alex",
            "Davi",
            "Gomes",
            "Everton",
            "Gabriel",
            "Alan",
            "Alysson",
            "joao",
            "Luiz",
            "Arthur",
            "Anthony",
            "Henrique",
            "Lais",
            "Natalia",
            "Jose"
        };
        Vector studentList = new Vector();

        for(int i = 0; i < 15; i++) {
            Student newStudent = new Student();
            newStudent.setName(nameList[i]);

            studentList.add(newStudent);
        }

        String result = studentList.toString();

        System.out.println("lista primaria: " + result);

        studentList.remove(3);
        studentList.remove(4);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Rodrigo");
        s2.setName("Casimiro");

        studentList.add(3, s1);
        studentList.add(4, s2);

        String newResult = studentList.toString();

        System.out.println("Nova lista: " + newResult);
    }
}