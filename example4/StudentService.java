package example4;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    public StudentService(List<Student> students) {
        this.students = new ArrayList<>();
    }

    private List<Student> students;

    public StudentService() {

    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int score, int age) {
    Student student = new Student(name, score, age);
    students.add(student);
    }
}
