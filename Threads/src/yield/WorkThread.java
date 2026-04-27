package yield;

public class WorkThread extends Thread{

    public volatile boolean work = true;

    public WorkThread(String name){ setName(name);}

    @Override
    public void run() {
        while(true){

            if(work){
                System.out.println(Thread.currentThread().getName());
            }
            else{
                Thread.yield();
            }

        }
    }
}
