package javasyntax.threading.kata;

public class Consumer implements Runnable{

    Queue queue;

    Consumer(Queue theQueue) {
        queue = theQueue;
        new Thread(this, "Consumer").start();

    }

    @Override
    public void run() {

    }
}
