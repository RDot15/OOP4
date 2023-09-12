package example4;

public class Teacher extends User{

    public Teacher(String name, int rating, String objectToTeacher) {
        super(name);
        this.rating = rating;
        this.objectToTeacher = objectToTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "rating=" + rating +
                ", objectToTeacher='" + objectToTeacher + '\'' +
                '}';
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private int rating;

    public String getObjectToTeacher() {
        return objectToTeacher;
    }

    public void setObjectToTeacher(String objectToTeacher) {
        this.objectToTeacher = objectToTeacher;
    }

    public Teacher(String name, String objectToTeacher) {
        super(name);
        this.objectToTeacher = objectToTeacher;
    }

    private String objectToTeacher;

    public Teacher(String name) {
        super(name);
    }




}
