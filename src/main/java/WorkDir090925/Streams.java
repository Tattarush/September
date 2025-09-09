package WorkDir090925;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("ok");
        list.add("Bye-bye");
        list.add("AAAAAAAAA");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);

        List<Integer> list2 = list.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        System.out.println(list2);

        String[] array = {"Hello", "Hei", "a"};
        Set<Integer> set = Arrays.stream(array)
                .map(x -> x.length())
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

        List<String> list3 = Arrays.asList("Hello", "kak dela", "Poka poka");

        List<String> list4 = list3.stream()
                .filter(s -> s.length() <=5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list4);
        long count = list4.stream()
                .count();

        List<String> words = Arrays.asList("java", "stream", "api", "lambda", "function", "method");
        List<String> changeWords = words.stream()
                .filter(s -> s.length() >5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(changeWords);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean check = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .limit(2)
                .anyMatch(x -> x > 15);
    }
}
