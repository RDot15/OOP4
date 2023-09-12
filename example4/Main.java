package example4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Student student1 = new Student("Student1", 12 , 19);

        Student student2 = new Student("Student2", -15 , 20);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

//        list.sort(new StudentComparator());
        System.out.println(list);
        List<User> userList = new ArrayList<>();
        Teacher teacher1 = new Teacher("teacher", "math");
        Teacher teacher2 = new Teacher("teacher", "history");
        Teacher teacher3 = new Teacher("teacher", "language");

        userList.add(student1);
        userList.add(student2);
        userList.add(teacher2);
        userList.add(teacher3);
        userList.add(teacher1);
        //System.out.println(userList);
        userList.sort(new UserComparator<User>());


      System.out.println(userList);
     /*   StudentService studentService = new StudentService();
        studentService.create("Student2", 10 , 18 );
        studentService.create("Student3", 14 , 21 );
        studentService.create("Student4", 13 , 22 );
*/
  //
        //
        //      System.out.println(studentService.getAll());

        System.out.println();


        TeacherService teacherService = new TeacherService();
        teacherService.create("teacher1",10, 29);
        teacherService.create("teacher2",8, 37);

        System.out.println(teacherService.getAll());




    }

}
