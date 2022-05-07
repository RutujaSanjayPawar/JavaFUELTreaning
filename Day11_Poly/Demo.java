// run time polymorphism
//Dynamic method dispatch

class A
{
 void read()
 {
  System.out.println("Read form HDD");
 }
}
class B extends A
{
 void read()
 {
 System.out.println("Read form USB");
 }
}
class C extends B
{
 void read()
 {
  System.out.println("Read from Network");
 }
}
class Demo
{
 public static void main(String[] args)
 {
  A ob1=new A();
  B ob2=new B();
  C ob3=new C();
  show(ob1);
  show(ob2);
  show(ob3);
 }
 static void show(A r)
 {
 r.read();
 }
}