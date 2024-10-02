package threads.SleepThreads;

public class SleepThreadsDemo {
    public static void main(String[] args) {
        SleepThreads thread1 = new SleepThreads("Thread 1");
        SleepThreads thread2 = new SleepThreads("Thread 2");
        thread1.start();
        thread2.start();
    }
}
