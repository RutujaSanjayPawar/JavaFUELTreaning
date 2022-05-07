
class Sequence
{
    static int count;
    static Sequence obj=null;
    private Sequence()
    {
        count=0;
    }
    static synchronized Sequence getInstance()
    {
        if(obj==null)
        {
            obj=new Sequence();
            System.out.println("object created");
        }
        count++;
        System.out.println("c");
        return obj;
    }
    static synchronized int getCount()
    {
        count++;
        return count;
    }

}
public class Demo
{
 public static void main(String[] args)
 {
     Sequence s=Sequence.getInstance();
 }
}
