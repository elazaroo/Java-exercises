package threads.CountThreads;

public class CountThreads extends Thread {
    Counter count;
    CountThreads(String nameInput, Counter counterInput) {
        super(nameInput);
        this.count = counterInput;
    }

    // Increment counter
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                int a = count.getCounter();
                sleep((long) (Math.random() * 10));
                count.setCounter(a + 1);
                System.out.println(getName()
                + " - counter: " + count.getCounter());
                sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                System.out.println("Interruption on thread: " + e);
            }
        }
        System.out.println("End - " + getName() + "...");
    }
}