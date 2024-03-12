package Models;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean equals(Object obj) {
        Student other = (Student) obj;

        return this.name.equals(other.name);
    }

    public String toString() {
        return this.name.toString();
    }
}