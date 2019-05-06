package javasyntax.threading;

import java.util.ArrayList;
import java.util.List;

public class MultiThreads {

    public static void main(String[] args) {

        System.out.println("Main thread starting.");

        // Construct my thread object
        new MyThread("Child #1");
        new MyThread("Child #2");
        new MyThread("Child #3");
        new MyThread("Child #4");

        int x = 10;
        for (int i = 0; i < x; i++) {
            System.out.print("." );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
                e.printStackTrace();
            }
        }
        System.out.println("Main thread ending");

    }

    static class MyThread implements Runnable {

        Thread thread;
        String myThread;

        @Override
        public void run() {

            System.out.println(myThread + " Starting");

            for (int count = 1; count <= 5; count++) {
                try {
                    Thread.sleep(100);
                    System.out.println("In " + myThread + " count is " + count);

                } catch (InterruptedException e) {
                    System.out.println(myThread + " interrupted");
                    e.printStackTrace();
                }

                // System.out.println(myThread + " terminated");
            }
        }

        public MyThread(String myThread) {

            this.myThread = myThread;

            thread = new Thread(this, myThread);
            thread.start();
        }

    }
}
