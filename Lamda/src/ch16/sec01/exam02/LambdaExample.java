package ch16.sec01.exam02;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((name,jon)->{

            System.out.println(name+" "+jon);


        });

        person.action((name,jon)->{System.out.println(name+" "+jon);});
        person.action2(System.out::println);
    }
}
