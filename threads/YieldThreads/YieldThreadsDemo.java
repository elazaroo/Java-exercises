package threads.YieldThreads;

public class YieldThreadsDemo {
    public static void main(String[] args) {
        YieldThreads thread1 = new YieldThreads("Thread 1");
        YieldThreads thread2 = new YieldThreads("Thread 2");
        thread1.start();
        thread2.start();
    }
}
