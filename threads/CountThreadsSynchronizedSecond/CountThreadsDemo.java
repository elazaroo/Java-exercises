package threads.CountThreadsSynchronizedSecond;

public class CountThreadsDemo {
    public static void main(String[] args) {
        Counter count = new Counter();
        CountThreads thread1 = new CountThreads("Thread 1", count);
        CountThreads thread2 = new CountThreads("Thread 2", count);
        CountThreads thread3 = new CountThreads("Thread 3", count);
        CountThreads thread4 = new CountThreads("Thread 4", count);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException i) {
            System.out.println("Interruption on thread: " + i);
        }
    }
}

