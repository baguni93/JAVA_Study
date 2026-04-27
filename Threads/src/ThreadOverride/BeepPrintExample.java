package ThreadOverride;

import java.awt.*;
import java.util.TreeMap;

public class BeepPrintExample {
    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run(){

                var tk = Toolkit.getDefaultToolkit();
                for (var i = 0; i < 100; i++){
                    tk.beep();
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }

            }
        };

        thread.start();

        for(var i = 0; i < 100; i++){
            System.out.println("땡");
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
}
