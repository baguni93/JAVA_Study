package test;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {

        Thread a= new Thread(){
                @Override
            public void run() {

                    var tk = Toolkit.getDefaultToolkit();
                    for(int i=0;i<5;i++){

                        System.out.println("beep 땡");
                        tk.beep();
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
        };
        a.start();

        for(int i=0;i<5;i++){

            System.out.println("땡");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
