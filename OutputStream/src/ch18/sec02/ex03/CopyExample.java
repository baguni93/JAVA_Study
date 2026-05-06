package ch18.sec02.ex03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws Exception {

        String original = "C:/Temp/test.jpg";
        String copy = "C:/Temp/test2.jpg";

        InputStream isr = new FileInputStream(original);
        OutputStream os = new FileOutputStream(copy);

        byte[] data = new byte[1024];

        while (true) {

            int num = isr.read(data);
            if(num==-1) break;
            os.write(data, 0, num);

        }

        os.flush();
        os.close();
        isr.close();

        System.out.println("복사 완료");
    }

}
