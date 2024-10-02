package threads.YieldThreads;

public class YieldThreads extends Thread
{
    public YieldThreads(String nameInput)
    {
        super(nameInput);
    }
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " " + getName());
            Thread.yield();
        }
        System.out.println("End! " + getName());
    }
}
