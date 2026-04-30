package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {

            Product product = new Product(i, "상품" + i, "멋진회사", (int)(10000*Math.random()));
            products.add(product);
        }

        Stream<Product> stream = products.stream();
        stream.forEach(System.out::println);
    }
}
