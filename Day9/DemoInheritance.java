class A
{
void show()
{
System.out.println("It is Base class");
}
}
class B extends A
{
void disp()
{
 System.out.println("It is Derived Class");
}
}
public class DemoInheritance
{
 public static void main(String args[])
 {
  B ob=new B();
  ob.show();
  ob.disp();
 }
}