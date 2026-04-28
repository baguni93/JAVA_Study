package PECS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();


        Collections.addAll(list1 , 1);

        addNumber(list1); // 가능: Integer
        addNumber(list2); // 가능: Number는 Integer의 상위 타입
        addNumber(list4); // 가능: Object도 Integer의 상위 타입

        // addNumber(list3); // 불가: Double은 Integer의 상위 타입이 아님
        addNumber(list1);

        addNumber2(list2 , 1);
    }

    private static void addNumber(List<? super Integer> list) {

        list.add(1);
        list.add(1);

        var a = list.get(0);

    }

    private static  <T> void addNumber2(List<? super T> c , T element) {

        c.add(element);

    }
}
