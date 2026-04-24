public class TryWithResourceExample {

    public static void main(String[] args) {
        Read("A");
        Read2("B");
        Read("C");
        Read("D");


    }

    public static void Read(String name){

        try(MyResource res = new MyResource(name))
        {
            String data = res.read1();
            int value = Integer.parseInt(data);
            System.out.println(value);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void Read2(String name){
        try(MyResource res = new MyResource(name))
        {
            String data = res.read2();
            int value = Integer.parseInt(data);
            System.out.println(value);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
