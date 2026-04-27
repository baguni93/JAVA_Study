package test;

public class ThreadExample {

    public static void main(String[] args) {

            MovieThread t1 = new MovieThread();
            MusicRunnable m1 = new MusicRunnable();

            t1.start();
            m1.run();
    }
}
