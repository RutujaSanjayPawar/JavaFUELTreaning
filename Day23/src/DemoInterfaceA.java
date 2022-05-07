
interface A
{
    void add(int x,int y);
}
class Test1 implements A
{
    @Override
    public void add(int x,int y)
    {
        System.out.println(x+y);
    }
}
public class DemoInterfaceA {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.add(10, 20);

        A ob1 = new A() {
            @Override
            public void add(int x, int y) {
                System.out.println(x + y);
            }
        };

        ob1.add(100, 200);
    }
}