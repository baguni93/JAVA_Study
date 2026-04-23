import java.io.IOException;

public class ThrowsRun {
    public static void main(String[] args) throws Exception {
        findClass();
    }

    public static void findClass() throws Exception {
        Class.forName("java.lang.String2");
    }

}
