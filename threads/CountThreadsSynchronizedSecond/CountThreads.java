package threads.CountThreadsSynchronizedSecond;

public class CountThreads extends Thread {
    Counter counter1;

    CountThreads(String nameInput, Counter counterInput) {
        super(nameInput);
        this.counter1 = counterInput;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                synchronized (counter1) {
                    int a = counter1.getCounter();
                    counter1.setCounter(a + 1);
                    System.out.println(getName() + " - counter: " + counter1.getCounter());
                }
            } catch (Exception e) {
                System.out.println("Interruption on thread: " + e);
            }
        }
        System.out.println("End - " + getName() + "...");
    }
}