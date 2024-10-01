package threads.TwoThreads;

public class SimpleThread1 extends Thread
{
    public SimpleThread1(String name)
    {
        super(name);
    }
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " " + getName());
        }
        System.out.println("Fin " + getName());
    }
}
