
//Thread Priority

class Test1 implements Runnable
{
    Thread t;
    Test1(String n,int p)
    {
        t=new Thread(this);
        t.setName(n);
        t.setPriority(p);
        t.start();
    }
    @Override
    public void run()
    {
        try {
            for (int i=0;i<5;i++)
            {
                System.out.println("Child thread "+t.getName()+":"+i);
                Thread.sleep(500);
            }
        }catch(Exception e)
        {

        }
    }
}
public class Demo6
{
    public static void main(String[] args)
    {
        Test1 t1=new Test1("A",Thread.MIN_PRIORITY);
        Test1 t2=new Test1("B",Thread.NORM_PRIORITY);
        Test1 t3=new Test1("C",Thread.MAX_PRIORITY);
        try {
            for (int i=0;i<5;i++)
            {
                System.out.println("main thread "+i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e)
        {

        }
    }
}
