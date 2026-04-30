package study_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static int  sum =0;
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            Product product = new Product(i, "상품" + i , "멋진회사", (int)(Math.random() * 10000));
            list.add(product);
        }

        list.forEach(x-> sum+=x.getPrice());
        System.out.println(sum);
        Stream<Product> stream = list.stream();
        stream.forEach(System.out::println);

    }
}
