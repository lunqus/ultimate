package javasyntax.threading.kata;

public class Producer implements Runnable {

    Queue queue;

    Producer(Queue theQueue) {
        queue = theQueue;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {

    }
}
