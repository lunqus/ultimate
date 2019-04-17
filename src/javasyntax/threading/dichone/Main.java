package javasyntax.threading.dichone;

public class Main {


    public static void main(String[] args) {

        new MultiThreads.MyThread("Thread #1");

        OneThread.MyThread mt = new OneThread.MyThread("Thread #2");
        Thread newThread = new Thread(mt);
        newThread.start();
    }
}
