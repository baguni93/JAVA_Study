package runnable;

import java.awt.*;

public class BeepPrintExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                var tk = Toolkit.getDefaultToolkit();
                for(int i=0; i< 5; i++){
                    tk.beep();
                    try{
                        Thread.sleep(500);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

            }

        });

        thread.start();

        for (int i=0; i< 5; i++){
            System.out.println("땡");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
