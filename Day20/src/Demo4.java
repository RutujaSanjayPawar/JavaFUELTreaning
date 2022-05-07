
class Share1
{
    int x;
    synchronized void get()
    {
        System.out.println("Got"+x);
    }
    synchronized void set(int y)
    {
        x=y;
        System.out.println("Put"+x);
    }
}
class Producer1 implements Runnable
{
    Thread t;
    Share1 ob;
    Producer1(Share1 ob1)
    {
        t=new Thread(this);
        ob=ob1;
        t.start();
    }
    @Override
    public void run()
    {
        int i=0;
        while(true)
        {
            ob.set(i);
            i++;
        }
    }
}
class Consumer1 implements Runnable
{
    Thread t;
    Share1 ob;
    Consumer1(Share1 ob1)
    {
        t=new Thread(this);
        ob=ob1;
        t.start();
    }
    @Override
    public void run()
    {
        int i=0;
        while(true)
        {
            ob.get();
            i++;
        }
    }
}
public class Demo4 {
    public static void main(String[] args)
    {
        Share1 ob=new Share1();
        Producer1 p=new Producer1(ob);
        Consumer1 c=new Consumer1(ob);
    }

}
