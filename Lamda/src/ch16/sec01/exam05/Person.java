package ch16.sec01.exam05;

public class Person {
    public void ordering(Comparable comparable){
        String a = "홍";
        String b = "김";

        int result = comparable.compareTo(a,b);

        System.out.println(result);

    }
}
