package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteExample {

    public static void main(String[] args) {
        try
        {
            OutputStream osw = new FileOutputStream("C:/Temp/test2.db");

            byte[] array = { 10, 20, 30};

            osw.write(array);

            osw.flush();
            osw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
