package WorkDir090925.persons;

import java.util.List;

public class User {
    private String name;
    //private int age;
    private boolean active;
    List<String> emails;

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public User(String name,List<String> emails, boolean active) {
        this.name = name;
       // this.age = age;
        this.active = active;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
