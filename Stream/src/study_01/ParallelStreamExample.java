package study_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample
{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Stream<String> stream = list.parallelStream();
        stream.forEach(name->System.out.println(name + ": " + Thread.currentThread().getName()));
    }
}
