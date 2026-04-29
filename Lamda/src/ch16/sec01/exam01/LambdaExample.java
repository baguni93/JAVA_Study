package ch16.sec01.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()->{

            System.out.println("Hello");

        });

        person.action(() -> System.out.println("Hello"));
    }
}
