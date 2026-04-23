import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("banana");
        list.add("pineapple");
        list.add("grape");
        list.add("orange");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);



        Collections.sort(list , new DescendingComparator());
        System.out.println(list);

        Collections.sort(list , new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);

        Collections.sort(list , new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                if(o1.length() != o2.length()){
                    return Integer.compare(o1.length(), o2.length());
                }
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
// 1. 길이가 다르면 → 길이 기준 정렬
// 2. 길이가 같으면 → 사전순 비교
    }
}
