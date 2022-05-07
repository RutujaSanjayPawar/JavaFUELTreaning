class A
{
 void show()
 {
 System.out.println("In A");
 }
}
class B extends A
{
 void show()
 {
  System.out.println("In B");
 }
}
public class DemoOverride
{
 public static void main(String[] args)
 {
  B ob=new B();
  ob.show();
 }
}