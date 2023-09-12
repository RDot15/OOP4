package example4;

public class Student extends User{


    private int score;
    private int age;

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", age=" + age +
                '}';
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int score, int age) {
        super(name);
        this.score = score;
        this.age = age;
    }

    public Student(String name) {
        super(name);
    }
}
