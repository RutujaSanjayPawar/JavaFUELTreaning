//try with single catch
import java.util.*;
public class DemoException
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  System.out.println("Enter 2 Numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  try {
    c=a/b;
    System.out.println("Division is"+c);
   }catch(ArithmeticException e)
   {
    System.out.println("can not divide by zero!!");
   }
   System.out.println("End");
 }
}