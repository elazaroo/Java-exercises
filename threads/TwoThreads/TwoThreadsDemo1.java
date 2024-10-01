package threads.TwoThreads;

public class TwoThreadsDemo1
{
    public static void main(String[] args) {
        SimpleThread1 thread1 = new SimpleThread1("Thread1");
        SimpleThread1 thread2 = new SimpleThread1("Thread2");
        thread1.start(); // No run
        thread2.start(); // No run
    }
}