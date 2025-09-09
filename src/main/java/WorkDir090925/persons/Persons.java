package WorkDir090925.persons;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Persons {
    public static void main(String[] args) {

//        List<User> users = Arrays.asList(
//                new User("Alice", 25, true),
//                new User("Bob", 30, false),
//                new User("Charlie", 20, true),
//                new User("Diana", 35, true),
//                new User("Eve", 28, false)
//        );
//
//        Set<String> userSet = users.stream()
//                .filter(x -> x.isActive() && x.getAge() >= 25 && x.getAge() <= 35)
//                .map(User::getName)
//                .collect(Collectors.toSet());
//        System.out.println(userSet);

        List<User> users = Arrays.asList(
                new User("Alice", Arrays.asList("a1@com", "a2@com"), true),
                new User("Bob", Arrays.asList("b1@com"), false),
                new User("Charlie", Arrays.asList("c1@com", "c2@com", "c3@com"), true)
        );

        List<String> mails = users.stream()
                .filter(User::isActive)
                        .flatMap(user ->
                                user.getEmails().stream()
                                        .map(email -> user.getName()+": "+ email)
                        )
                                .collect(Collectors.toList());


        Map<Integer, List<String>> map = mails.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);


        List<String> stringList = Arrays.asList("apple", "banana", "avocado", "cherry", "blberry");
        Map<Integer, List<String>> map1 = stringList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map1);
    }
}
