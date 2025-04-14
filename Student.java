// Student.java
public class Student {
    private int id;
    private String name;
    private int age;

    // Constructors, getters, and setters
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // toString for display
    public String toString() {
        return id + " - " + name + " - " + age;
    }
}
