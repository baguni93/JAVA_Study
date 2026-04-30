package study_04;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static int  sum =0;
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c"};
        for (String s : strArray) {
            System.out.println(s);
        }

        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(System.out::println);

        System.out.println("--------------");


        int[]  intArray = {1, 2, 3};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::println);

        System.out.println("--------------");


        IntStream intStream1 = IntStream.rangeClosed(1, 100);
        intStream1.forEach(a -> sum += a);
        System.out.println(sum);

    }
}
