package study_01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Stream<String> stream = set.stream();
        stream.forEach(System.out::println);

        Stream<String> stream2 = set.stream();
        stream2.forEach(x-> System.out.println(x));

    }
}
