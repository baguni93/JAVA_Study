package ch16.sec01.exam05;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering((a,b)-> a.compareToIgnoreCase(b));
        person.ordering(String::compareToIgnoreCase);
    }
}
