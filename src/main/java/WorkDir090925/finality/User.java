package WorkDir090925.finality;


import java.util.List;

public class User {
    String name;
    String department;
    boolean active;
    List<Project> projects;

    public User(String name, String department, boolean active, List<Project> projects) {
        this.name = name;
        this.department = department;
        this.active = active;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}



class Project {
    String name;
    int score;

    public Project(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
