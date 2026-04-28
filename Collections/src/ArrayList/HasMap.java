package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HasMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        System.out.println(map.size());
        System.out.println(map.get("A"));
        System.out.println();

        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
            System.out.println();
        }
        map.remove("A");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }


        String[] all = {
                "홍길동" // 0 + 1 =  1 //
                ,
                "김길동" // 0 + 1 = 1
                ,
                "정길동" // 0 + 1 = 1
                ,
                "홍길동" // 1 + 1 = 2
                ,
                "김길동" // 1 + 1 = 2
                ,
                "홍길동" // 2 + 1 = 3
        };
        Map<String, Integer> map2 = new HashMap<>();

        for(String name : all){
            map2.put(name, map2.getOrDefault(name, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }


    }
}
