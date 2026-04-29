package TreeSet;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(87);
        treeSet.add(90);
        treeSet.add(91);
        treeSet.add(92);
        treeSet.add(93);
        treeSet.add(93);

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        System.out.println("\n");


        System.out.println("가장 낮은 점수 : " + treeSet.first());
        System.out.println("가장 높은 점수 : " + treeSet.last());
        System.out.println("95점 미만 점수 : " + treeSet.lower(95));
        System.out.println("95점 초과 점수 : " + treeSet.higher(95));
        System.out.println("95점 이하 점수 : " + treeSet.floor(95));
        System.out.println("85점 이상 점수 : " + treeSet.ceiling(85));


        NavigableSet<Integer> navigableSet = treeSet.descendingSet();

        for (Integer integer : navigableSet) {
            System.out.println(integer);
        }

        System.out.println("\n");

        NavigableSet<Integer> navigableSet1 = treeSet.tailSet(80, true);

        for (Integer integer : navigableSet1) {
            System.out.println(integer);
        }

        System.out.println("\n");

        navigableSet1 = treeSet.subSet(80 ,true , 90 ,false);

        for (Integer integer : navigableSet1) {
            System.out.println(integer);
        }

        System.out.println("\n");

    }

}
