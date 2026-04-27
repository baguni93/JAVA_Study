package demonThread;

public class AutoSaveThread extends Thread {

    public void save(){
        System.out.println("AutoSaveThread");
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                break;
            }

            save();
        }
    }
}
