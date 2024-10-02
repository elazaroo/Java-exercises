package threads.JoinThreads;

public class JoinThreadsDemo {
    public static void main(String[] args) {
        JoinThreads thread1 = new JoinThreads("Thread 1");
        JoinThreads thread2 = new JoinThreads("Thread 2");
        JoinThreads thread3 = new JoinThreads("Thread 3");
        JoinThreads thread4 = new JoinThreads("Thread 4");
        try
        {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            System.out.println("Finished main");
        } catch (InterruptedException i)
        {
            System.out.println("Error: " + i);
        }
    }
}
