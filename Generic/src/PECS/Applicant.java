package PECS;

public class Applicant<T>{

    public Applicant(T a) {
        System.out.println(a.getClass().getSimpleName());
    }
}
