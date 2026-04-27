package yield;

public class YieldExample {
    public static void main(String[] args) {

        WorkThread workThreadA = new WorkThread("A");
        WorkThread workThreadB = new WorkThread("B");
        workThreadA.start();
        workThreadB.start();

        try { Thread.sleep(500); } catch (InterruptedException e) {}
        workThreadA.work =false;

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        workThreadB.work =false;
    }
}
