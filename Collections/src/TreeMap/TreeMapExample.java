package TreeMap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String , Integer> map = new TreeMap<>();

        map.put("apple", 10);
        map.put("orange", 20);
        map.put("pear", 30);
        map.put("banana", 40);
        map.put("kiwi", 50);
        map.put("cherry", 60);
        map.put("pineapple", 70);

        Set<Map.Entry<String , Integer>> set = map.entrySet();
        for (Map.Entry<String , Integer> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        Map.Entry<String , Integer> entry = null;
        entry = map.firstEntry();
        System.out.println("제일 앞 단어 : " + entry.getKey() + " : " + entry.getValue());
        entry = map.lastEntry();
        System.out.println("제일 뒤 단어 : " +entry.getKey() + " : " + entry.getValue());
        entry = map.lowerEntry("banana");
        System.out.println("banana 앞 단어 : " +entry.getKey() + " : " + entry.getValue());

        NavigableMap<String , Integer> descendingMap = map.descendingMap();
        Set<Map.Entry<String , Integer>> descendingSet = descendingMap.entrySet();
        for (Map.Entry<String , Integer> descendingEntry : descendingSet) {
            System.out.println(descendingEntry.getKey() + " : " + descendingEntry.getValue());
        }
        System.out.println();

        System.out.println("c-h 사이의 단어 검색");

        NavigableMap<String , Integer> rangesMap = map.subMap("c", true,"h",false);
        for (Map.Entry<String , Integer> rangesEntry : rangesMap.entrySet()) {
            System.out.println(rangesEntry.getKey() + " : " + rangesEntry.getValue());
        }
    }

}
