package SixthLesson.UserSupAndSub;

public class UserSuperclass {

    String name;
    int age = 0;

    public UserSuperclass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserSuperclass() {
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User " +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
