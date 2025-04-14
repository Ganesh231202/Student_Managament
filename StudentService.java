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
