package SixthLesson.UserSupAndSub;

public class UserSuperclass {

    String name;
    int age = 0;

    public UserSuperclass() {
    }

    public String getInfo() {
        return String.valueOf(age);
    }

//    @Override
//    public String toString() {
//        return "User " +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
