package example4;

import java.util.List;

public interface UserService <T>{
public List<T> getAll();

void create (String name, int score, int age);

}
