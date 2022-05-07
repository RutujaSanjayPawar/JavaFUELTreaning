class Aa
{
Aa()                //Create Constructor
{
 System.out.println("It is class Aa");     
}
}
class Bb extends Aa
{
 Bb()
 {
  System.out.println("It is Derivad class from Aa");
 }
}
class Cc extends Bb
{
 Cc()
 {
  System.out.println("It is Derivad class from Bb");
 }
}
public class DemoInheritance1
{
 public static void main(String args[])
 {
  Cc ob=new Cc(); 
 }
}