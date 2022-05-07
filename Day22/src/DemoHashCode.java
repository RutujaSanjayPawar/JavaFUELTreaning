import java.util.HashSet;

class Student1
{
    int id;
    String name;
    Student1(int a,String b)
    {
        id=a;
        name=b;
    }
    @Override
    public String toString()
    {
        return ("("+id+","+name+")");
    }
    @Override
    public int hashCode()
    {
        int code;
        code=(((name.hashCode()/2)%100)+(id/2)%100);
        //code=(name.hashCode()+id);
        return code;
    }
    @Override
    public boolean equals(Object obj)
    {
        boolean f=false;
        Student1 st=(Student1) obj;
        if (id==st.id && name.equals(st.name))
        {
            f=true;
        }
        return f;
    }
}
public class DemoHashCode
{
    public static void main(String[] args)
    {
        HashSet<Student1> hs;
        hs=new HashSet<>();
        Student1 st1=new Student1(1,"A");
        Student1 st2=new Student1(1,"A");
        hs.add(st1);
        hs.add(st2);

        System.out.println(hs);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
