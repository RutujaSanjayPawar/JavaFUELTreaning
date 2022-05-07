//Wait and Notify

class Share
{
    int x;
    boolean f=false;
    synchronized void get()
    {
        try
        {
            if(f==false)
            {
                wait();
            }
        }catch(Exception e)
        {

        }
        System.out.println("Got"+x);
        f=false;
        notify();
    }
    synchronized void set(int y)
    {
        try
        {
            if(f==true)
            {
                wait();
            }
        }catch(Exception e)
        {

        }
        x=y;
        System.out.println("put"+x);
        f=true;
        notify();

    }
}
class Producer implements Runnable
{
 Thread t;
 Share ob;
 Producer(Share ob1)
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
class Consumer implements Runnable
{
  Thread t;
  Share ob;
  Consumer(Share ob1)
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
public class Demo5 {
    public static void main(String[] args)
    {
        Share ob=new Share();
        Producer p=new Producer(ob);
        Consumer c=new Consumer(ob);
    }
}
