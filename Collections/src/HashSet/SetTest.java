package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class SetTest {

    public static void main(String[] args) {
        String s = "bbbaaacdddefecge";

        HashSet<String> set = new HashSet<String>();
        String[] s2 = s.split("");
        Arrays.sort(s2);

        for (String s1 : s2) {
            set.add(s1);
        }

        System.out.println(set);

        Object[] arr = set.toArray();

        for (Object o : arr) {
            System.out.println(o +"");
        }


    }
}
