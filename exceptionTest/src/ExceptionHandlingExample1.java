public class ExceptionHandlingExample1 {

    public static void printLength(String data){

        try{
            int result = data.length();
            System.out.println(result);
        }
        catch(Exception e){

            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJAVA");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
