package threads.CountThreadsSynchronized;

public class Counter {
    protected int counter = 0;

    public synchronized int incCounter(int count) {
        counter += count;
        return counter;
    }
}
