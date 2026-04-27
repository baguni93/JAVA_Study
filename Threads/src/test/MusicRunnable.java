package test;

public class MusicRunnable implements  Runnable {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {@Override

        public void run() {

            for(int i=0;i<6;i++){

                System.out.println("음악을 재생합니다.");

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {}


            }



        }});

        thread.start();
    }

    @Override
    public void run() {
        main(new String[0]);

    }

}
