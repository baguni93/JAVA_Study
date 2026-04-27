package waitnotify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();

        var threadA = new ThreadA(workObject);

        var threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();

    }
}
