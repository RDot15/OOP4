package example4;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getScore() - o2.getScore();


    }


}







/*
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student){
            int scorRes = ((Student)o1).getScore() - ((Student)o2).getScore();
return scorRes;
        }


        return -1;



    }
*/


