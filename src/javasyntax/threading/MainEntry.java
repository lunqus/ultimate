package javasyntax.threading;

public class MainEntry {

    public static void main(String[] args) {

        System.out.println("Main thread starting.");

        // Construct my thread object
        MyThread mt = new MyThread("Child #1");

        // Construct an actual thread from our previous object
        Thread newThread = new Thread(mt);
        newThread.start();

    }

    static class MyThread implements Runnable {

        String myThread;
        @Override
        public void run() {

            System.out.println(myThread + " Starting");

            for (int count = 0; count < 10; count++) {
                try {
                    Thread.sleep(400);
                    System.out.println("In " + myThread + " count is " + count);

                } catch (InterruptedException e) {
                    System.out.println(myThread + " interrupted");
                    e.printStackTrace();
                }

                System.out.println(myThread + " terminated");
            }
        }

        public MyThread(String myThread) {
            this.myThread = myThread;
        }

    }
}
