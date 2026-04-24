public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("MyResource constructor called" + name);
    }

    public String read1(){
        System.out.println("MyResource read1 called" + name);
        return "100";
    }

    public String read2(){
        System.out.println("MyResource read2 called" + name);
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResource close() called" + name);
    }
}
