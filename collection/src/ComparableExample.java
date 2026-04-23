import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 85));
        students.add(new Student("김길동", 92));
        students.add(new Student("이길동", 78));
        students.add(new Student("박길동", 95));
        students.add(new Student("최길동", 88));

        System.out.println("====정렬전");

        for (Student student : students) {

            System.out.println(student);
        }

        Collections.sort(list);

        System.out.println("점수 오름차순 정렬 후");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
