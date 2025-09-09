package WorkDir090925.finality;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Alice", "Backend", true, Arrays.asList(
                        new Project("API Gateway", 8),
                        new Project("Auth Service", 9)
                )),
                new User("Bob", "Frontend", false, Arrays.asList(
                        new Project("Dashboard", 7),
                        new Project("UI Kit", 6)
                )),
                new User("Charlie", "Backend", true, Arrays.asList(
                        new Project("API Gateway", 9),
                        new Project("Data Sync", 10)
                )),
                new User("Diana", "Frontend", true, Arrays.asList(
                        new Project("Dashboard", 9),
                        new Project("Mobile App", 8)
                )),
                new User("Eve", "DevOps", true, Arrays.asList(
                        new Project("CI/CD Pipeline", 10)
                )),
                new User("Frank", "Backend", false, Arrays.asList(
                        new Project("Data Sync", 7)
                ))
        );


        String str = users.stream()
                .filter(User::isActive)
                .flatMap(user -> user.projects.stream())
                .collect(Collectors.groupingBy(Project::getName))
                .entrySet().stream()
                .sorted((o1, o2) -> {
                    int count = Integer.compare(o2.getValue().size(), o1.getValue().size());
                    if (count != 0) return count;
                    double avg1 = o1.getValue().stream().mapToInt(Project::getScore).average().orElse(0);
                    double avg2 = o2.getValue().stream().mapToInt(Project::getScore).average().orElse(0);
                    return Double.compare(avg2, avg1);
                })
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
        System.out.println(str);
    }
}
