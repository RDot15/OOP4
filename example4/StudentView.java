package example4;
import java.util.List;
import java.util.logging.Logger;
public class StudentView <T extends Student> implements UserView<T> {

    //Logger logger = Logger.getLogger(StudentView.class.getName());


    public void sendOnConsole(List<T> students) {
        for(T user: students){
            System.out.println(user);;
        }
    }
//
//    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
//        logger.info(studentGroup.toString());

    }

