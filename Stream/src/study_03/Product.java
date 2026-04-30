package study_03;

import lombok.Getter;

@Getter
public class Product {

    private int pno;

    private String name;
    private String company;
    private int price;

    public Product(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;

    }

    @Override
    public String toString() {
        return "{" +
                "pno : " + pno + ", " +
                "name : " + name + ", " +
                "company : " + company + ", " +
                "price : " + price +
                "}";

    }

}
