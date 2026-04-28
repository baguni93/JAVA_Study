package PECS;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {


    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.1);
        doubleList.add(3.1);

        printList(integerList);
        printList(doubleList);

        System.out.println();

        printList2(integerList);
        printList2(doubleList);

    }


    public static <T extends Number>  void printList(List<T> list) {

        for (T number : list) {
            System.out.println(number);
        }



    }


    public static void printList2(List<? extends Number> list) {

        for (Number number : list) {
            System.out.println(number);
        }

    }

}
