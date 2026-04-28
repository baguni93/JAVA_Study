package test;

public class Applicant<T> {

    private T k;

    public Applicant(T k) {
        this.k = k;
    }

    public T getKind() {
        return k;
    }
}
