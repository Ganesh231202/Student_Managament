# Student_Managament
1. Project Title:
Student Management System (Example)

2. Problem Statement:
To build a simple Java-based application to perform basic CRUD operations (Create, Read, Update, Delete) on student data using object-oriented programming concepts.

3. Tools & Technologies Used:
Programming Language: Java

IDE: IntelliJ IDEA / Eclipse

Java Version: Java 8 or later

Data Storage: In-memory using ArrayList (or use JDBC for database connection)

4. Modules Implemented:
Student Class: Java Bean for student attributes (id, name, age, grade)

StudentService: Class with methods to add, delete, update, and display students

Main Class: Menu-driven console application for user interaction

5. Features Developed:
Add new student

Display all students

Update existing student

Delete student by ID

6. Code Snippet Example:
java
Copy
Edit
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
java
Copy
Edit
// StudentService.java
import java.util.*;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void displayStudents() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        studentList.removeIf(s -> s.getId() == id);
    }
}
java
Copy
Edit
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);
        // menu options here (add, display, delete)
    }
}
7. Challenges Faced:
Managing dynamic lists

Handling user input and validation

8. Outcome:
Successfully developed a functional Java application that manages student records using object-oriented principles.
