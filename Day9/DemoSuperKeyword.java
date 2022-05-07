class A1
{
  int i;
  A1()
  {
   i=10;
   System.out.println("In A1");
  }
}
class B1 extends A1
{
  int i;
  B1()
  {
  i=20;
  System.out.println("In B1");
  }
}
void add()
{
 System.out.println(super.i+i);
}

public class DemoSuperKeyword
{
  public static void main(String[] args)
  {
   B1 ob=new B1();
   ob.add();
  }
}