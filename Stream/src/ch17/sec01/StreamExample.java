package ch17.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("홍길동" , 10 ));
        students.add(new Student("신용권" , 20 ));
        students.add(new Student("유미선" , 30 ));


        Stream<Student> stream = students.stream();
        var scoreStream = stream.mapToInt(Student::getScore);
        double score = scoreStream.average().getAsDouble();
        System.out.println(score);

        double avg = students.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println(avg);
        double avg2 = students.stream().mapToInt(x->x.getScore()).average().getAsDouble();
        System.out.println(avg2);
    }

}
