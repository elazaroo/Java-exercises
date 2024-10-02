package threads.RunnableThreads;

public class RunnableThreadsDemo {
    public static void main(String[] args) {
        RunnableThreads thread1 = new RunnableThreads("Thread 1");
        RunnableThreads thread2 = new RunnableThreads("Thread 2");

        Thread h1 = new Thread(thread1);
        Thread h2 = new Thread(thread2);
        h1.start();
        h2.start();
    }
}
