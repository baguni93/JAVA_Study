package ch16.sec01.exam03;

public class Person {

    public void action(Calcuable calcuable) {
        double speak = calcuable.calcu(0.5, 0.5);
        System.out.println(speak);
    }
}
