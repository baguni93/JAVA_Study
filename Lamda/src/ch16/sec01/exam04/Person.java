package ch16.sec01.exam04;

public class Person {
    public void action(Calcuable calcuable){
        double result = calcuable.calcu(10, 1.4);
        System.out.println(result);
    }
}
