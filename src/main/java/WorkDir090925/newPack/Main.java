package WorkDir090925.newPack;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Alice", 25, true, "Moscow"),
                new User("Bob", 30, false, "Berlin"),
                new User("Charlie", 25, true, "Moscow"),
                new User("Diana", 35, true, "Berlin"),
                new User("Eve", 28, false, "Moscow"),
                new User("Frank", 30, true, "Berlin")
        );

//        Map<Integer, List<User>> ages = users.stream()
//                .collect(Collectors.groupingBy(User::getAge));
//        System.out.println(ages);


//        Map<String, Long> maps = users.stream()
//                .filter(User::isActive)
//                .collect(Collectors.groupingBy(User::getCity, Collectors.counting()));
//        System.out.println(maps);


        Map<String,Map<Integer,List<String>>> maps = users.stream()
                .collect(Collectors.
                        groupingBy(User::getCity,
                                Collectors.groupingBy(User::getAge,
                                        Collectors.mapping(User::getName,Collectors.toList()))));
        System.out.println(maps);
    }
}
