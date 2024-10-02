package threads.RunnableThreads;

public class RunnableThreads implements Runnable
{
    String name;

    public RunnableThreads(String nameInput)
    {
        this.name = nameInput;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " " + name);
        }
        System.out.println("End! " + name);
    }
}
