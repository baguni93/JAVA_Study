package PECS;

public class Course {

    public static void registerCourse1(Applicant<?> applicant){
    }

    public static void registerCourse2(Applicant<? extends Student> applicant){

    }

    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println("registerCourse3 호출됨");
    }
}
