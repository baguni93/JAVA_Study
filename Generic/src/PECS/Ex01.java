package PECS;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("2");

        List list2 = new ArrayList();
        list2.add(2);
        list2.add(1);

        printList(list);
        printList(list2);

        System.out.println();

        printList2(list);
        printList2(list2);
    }

    public static <T> void printList(List<T> list){

        for(T t : list){
            System.out.println(t);
        }

    }

    public static void printList2(List<?> list){

        for(Object o : list){
            System.out.println(o);
        }

    }
}
