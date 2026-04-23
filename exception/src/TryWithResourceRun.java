import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceRun {

    public static void main(String[] args) {

        try(MyResource res = new MyResource("A")){
            String data = res.read1();
            //String data = res.read2();
            //java.base/java.lang.NumberFormatException.forInputString
            int value = Integer.parseInt(data);
            System.out.println(value);
        }
        catch(Exception e){
            e.printStackTrace(); // 에러가 어디서 어떻게 발생했는지 추적 로그 찍기
            System.out.println("예외발생!");
        }

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");

        try(res1 ; res2){
             String data1 = res1.read2();
             String data2 = res2.read1();
            //int value = Integer.parseInt(data1);
            System.out.println(data1);
        }
        catch(Exception e){
            System.out.println("예외발생 !! " + e.getMessage());
        }


        String path = "test.text";

        try(FileWriter fw = new FileWriter(path)){

            fw.write("Hello World");
            System.out.println("파일 생성 성공");
        }catch(IOException e){

            System.out.println("파일 생성 실패" + e.getMessage());
        }

        try(FileReader fr = new FileReader(path)){
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){

            System.out.println("파일 읽기 실패" + e.getMessage());

            throw new RuntimeException();
        }
    }
}
