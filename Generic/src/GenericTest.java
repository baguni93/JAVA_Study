import java.sql.Array;
import java.util.ArrayList;

public class GenericTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("홍길동");
        list.add("김길동");
        list.add("송길동");

        System.out.println(list);
        var isText = ((String)list.get(0)).equals("홍길동");
        System.out.println(isText);

        ArrayList list2 = new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("홍길동");
        System.out.println(list3);

        ArrayList<Integer> list4= new ArrayList<>();
        list4.add(100);
        list4.add(200);
        list4.add(300);
        System.out.println(list4);


    }

}
