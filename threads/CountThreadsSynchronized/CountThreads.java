package threads.CountThreadsSynchronized;

public class CountThreads extends Thread {
    Counter counter1;

    CountThreads(String nameInput, Counter counterInput) {
        super(nameInput);
        this.counter1 = counterInput;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + " - counter: " + counter1.incCounter(1));
        }
        System.out.println("End - " + getName() + "...");
    }
}