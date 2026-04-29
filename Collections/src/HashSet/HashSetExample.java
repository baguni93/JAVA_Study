package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set= new HashSet<String>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");

        int  size = set.size();
        System.out.println(size);

        System.out.println(set);

        System.out.println();


        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
            if(s.equals("a")){
                iterator.remove();
            }
        }

        System.out.println();

        boolean result = set.remove("a");

        System.out.println(result);

        for(String s: set){
            System.out.println(s);
        }
    }

}
