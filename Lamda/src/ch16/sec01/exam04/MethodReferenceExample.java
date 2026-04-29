package ch16.sec01.exam04;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(Computer::staticMethod);
        person.action(new Computer()::instanceMethod);



    }
}
