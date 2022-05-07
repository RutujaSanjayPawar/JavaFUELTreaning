class Test1
{
 int i;
 static int j;  //static variable-->only one copy of static variable is present,No matter how many obj is created.
 
 Test1()    //Constructer
 {
  i=i+1;   //i is instance variable that's why each object saperte memory allocation.
  j=j+1;    //j is static
 }
 void main()
 {
  System.out.println(i);
  System.out.println(j);
 }
 
}

public class DemoInstAndStaticClass
{
 public static void main(String[] args)
 {
  Test1 t1=new Test1();
  Test1 t2=new Test1();
  Test1 t3=new Test1();
  t1.show();
  t2.show();
  t3.show();
 }
}