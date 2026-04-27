package Synchronized;

public class Calculator {

    int memory;

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println(Thread.currentThread().getName() + ":" + this.memory );
    }

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

            System.out.println(Thread.currentThread().getName() + ":" + this.memory );
        }
    }
}
