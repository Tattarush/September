package WorkDir090925.newPack;

public class User {
    String name;
    int age;
    boolean active;
    String city;

    public User(String name, int age, boolean active, String city) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", city='" + city + '\'' +
                '}';
    }
}
