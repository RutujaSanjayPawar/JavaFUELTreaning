
class Test3<T>
{
    T i;
    void set(T x)
    {
        i=x;
    }
    void show()
    {
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class Demo3
{
    public static void main(String[] args)
    {
        Test3<String> t1=new Test3<>();
        Test3<Integer> t2=new Test3<>();
        t1.set("Hello");
        t2.set(100);
        t1.show();
        t2.show();
    }
}
