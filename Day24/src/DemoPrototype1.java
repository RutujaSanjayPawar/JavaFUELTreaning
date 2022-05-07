import java.util.ArrayList;
class Student1 implements Cloneable
{
    ArrayList<String> ar;

    Student1()
    {
        ar=new ArrayList<>();
    }
    Student1(ArrayList<String> t)
    {
        ar=t;
    }
    void loadData()
    {
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
    }
    void show()
    {
        System.out.println("-----------------");
        for(String s:ar)
        {
            System.out.println(s);
        }
        System.out.println("-------------------");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        ArrayList<String> ar2;
        ar2=new ArrayList<>();
        for (String s:ar)
        {
            ar2.add(s);
        }
        Student1 obj=new Student1(ar2);
        return obj;
    }
}
public class DemoPrototype1
{
    public static void main(String[] args) throws Exception
    {
        Student1 st1=new Student1();
        st1.loadData();
        st1.show();
        Student1 st2=(Student1)st1.clone();
        //Student1 st2=st1;
        st2.show();
        st2.ar.remove("c");
                System.out.println("**st1 Object**");
        st1.show();
        System.out.println("**st2 Object**");
        st2.show();
    }
}
