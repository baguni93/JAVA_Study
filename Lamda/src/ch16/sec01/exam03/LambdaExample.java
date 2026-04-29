package ch16.sec01.exam03;

public class LambdaExample {
    public static void main(String[] args) {

        Person person = new Person();

        person.action((double x, double y) -> {
            return x+y; });
        person.action((x,y) -> (x+y));
        person.action(Double::sum);
        person.action(LambdaExample::sum);
    }

    public static double sum(double x, double y) {
        return x+y;
    }
}
