class Test1
{
 void add(int x,int y)
 {
  System.out.println("int addition");
  System.out.println(x+y);  
 }
 void add(float x,float y)
 {
  System.out.println("float addition");
  System.out.println(x+y);  
 }
}

public class DemoOverloading
{
 public static void main(String[] args)
 {
 Test1 t1=new Test1();
 t1.add(1.1f,2.2f);
 t1.add(1,2);
 
 }
}