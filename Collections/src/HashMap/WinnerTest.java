package HashMap;

import java.util.HashMap;

public class WinnerTest {


    public static void main(String[] args) {
        String[] a = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String key : a)
        {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println(map);

        int max = 0;
        for(String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                System.out.println(key);
            }
        }
    }

}

