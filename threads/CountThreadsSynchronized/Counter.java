package threads.CountThreadsSynchronized;

public class Counter {
    protected int counter = 0;

    public synchronized int incCounter(int count) {
        counter += count;
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter;
    }
}