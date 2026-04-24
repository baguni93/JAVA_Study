public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {

            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] : " + value);
            }
            catch (NumberFormatException  | NullPointerException e){
                System.out.println("NumberFormatException | NullPointerException : " + e.getMessage());

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
            }
            catch (Exception e){
                System.out.println("Exception : " + e.getMessage());
            }

        }
    }
}
