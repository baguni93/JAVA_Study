package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Borad> list = new ArrayList<>();

        list.add(new Borad(1));
        list.add(new Borad(2));
        list.add(new Borad(3));

        Borad board = list.get(2);
        System.out.println(board.age);
        System.out.println();

        for( Borad b : list){
            System.out.println(b.age);
        }

        System.out.println();
        list.remove(1);
        // 인덱스로 삭제 - 뒤 요소가 앞으로 당겨짐

        Borad board2 = list.get(0);
        System.out.println(board2.age);

        Borad board3= list.get(1);
        System.out.println(board3.age);
    }
}
