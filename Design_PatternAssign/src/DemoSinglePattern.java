
class Student
{
    static Student obj=null;
    static int count;
    private Student()
    {
        count=0;
    }
    static synchronized Student getInstance()
    {
        if (obj==null)
        {
            obj=new Student();
            System.out.println("Student docFile is created ");
        }
        count++;
        System.out.println("DocFile "+count);
        return obj;
    }
}
public class DemoSinglePattern
{
    public static void main(String[] args)
    {
        Student st1=Student.getInstance();
        Student st2=Student.getInstance();
        Student st3=Student.getInstance();
    }
}
