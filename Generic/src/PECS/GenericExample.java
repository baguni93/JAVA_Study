package PECS;

public class GenericExample {

    public static void main(String[] args) {

        System.out.println("[Course1 - 모든 사람]");
        Course.registerCourse1(new Applicant<>(new Person()));
        Course.registerCourse1(new Applicant<>(new Worker()));
        Course.registerCourse1(new Applicant<>(new Student()));
        Course.registerCourse1(new Applicant<>(new HighStudent()));
        Course.registerCourse1(new Applicant<>(new MiddleStudent()));

        System.out.println("[Course2 - 학생만]");
        Course.registerCourse2(new Applicant<>(new Student()));
        Course.registerCourse2(new Applicant<>(new HighStudent()));
        Course.registerCourse2(new Applicant<>(new MiddleStudent()));

        System.out.println("[Course3 - 직장인/일반인만]");
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Person>(new Student()));
        // Course.registerCourse3(new Applicant<>(new Student()));       // 불가 - Student 는 Worker 하위 아님
        // Course.registerCourse3(new Applicant<>(new HighStudent()));   // 불가
        // Course.registerCourse3(new Applicant<>(new MiddleStudent())); // 불가
    }
}
