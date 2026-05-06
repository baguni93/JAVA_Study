package ch18.sec10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);


        Member member = new Member("fall", "단풍이");
        Product product = new Product("노트북", 1500000);
        int[] arr1 = { 1, 2, 3};

        oos.writeObject(member);
        oos.writeObject(product);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member member1 = (Member) ois.readObject();
        Product product1 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(member1);
        System.out.println(product1);
        System.out.println(Arrays.toString(arr1));

    }

}
