package threads.SleepThreads;

public class SleepThreads extends Thread
{
    public SleepThreads(String name)
    {
        super(name);
    }
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " " + getName());
            try
            {
                sleep(2000);
            } catch (InterruptedException e)
            {
                System.out.println("Error: " + e);
            }
        }
        System.out.println("End!" + getName());
    }
}
