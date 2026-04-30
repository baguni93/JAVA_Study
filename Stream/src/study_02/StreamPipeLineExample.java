package study_02;

import ch17.sec01.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("홍길동", 20),
                new Student("홍길동", 30)
        );

        list.forEach(System.out::println);

        Stream<Student> stream = list.stream();
        //mapToInt() 메소드는 객체를 int값으로 매핑해서 IntStream으로 변환시킨다.
        IntStream integerStream = list.stream().mapToInt(Student::getScore);
        double avg_score = integerStream.average().getAsDouble();

        System.out.println(avg_score);


        double avg =list.stream().mapToInt(Student::getScore).average().getAsDouble();

        System.out.println(avg);
    }
}
