package WorkDir090925.NewPack2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        List<String> words = Arrays.asList("a", "bb", "ccc", "dddd");
//        Integer sum = words.stream()
//                .map(String::length)
//                .reduce(0, (x,y)-> x + y);
//        System.out.println(sum);

//        List<Integer> list = Arrays.asList(3, 7, 2, 9, 5);
//
//       Integer max = list.stream()
//                .reduce(Integer::max)
//                .orElse(-1);
//        System.out.println(max);

        List<String> words = Arrays.asList("hello", "world", "java", "stream");

        String str = words.stream()
                .reduce((str1, str2) -> str1 + ", " + str2)
                .orElse("");
        System.out.println(str);
    }
}
