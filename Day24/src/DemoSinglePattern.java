
class Sequence1 {
    static Sequence1 obj = null;
    static int count;

    private Sequence1()
    {
        count=0;
    }
        static synchronized Sequence1 getInstance()
        {
            if (obj == null) {
                obj = new Sequence1();
                System.out.println("Object created");
            }
            count++;
            System.out.println("Count is " + count);
            return obj;
        }
    }


public class DemoSinglePattern
{
    public static void main(String[] args)
    {
        Sequence1 s1=Sequence1.getInstance();
        Sequence1 s2=Sequence1.getInstance();
        Sequence1 s3=Sequence1.getInstance();
        Sequence1 s4=Sequence1.getInstance();
    }
}
