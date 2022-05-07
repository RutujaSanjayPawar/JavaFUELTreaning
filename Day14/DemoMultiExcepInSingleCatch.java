import java.util.*;
//new way to handle multiple Exception by using single catch
public class DemoMultiExcepInSingleCatch
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  System.out.println("Enter 2 numbers");
  
  try
  {
   a=sc.nextInt();
   b=sc.nextInt();
   c=a/b;
   System.out.println("Division is"+c);
   
  }catch(ArithmeticException|InputMismatchException e)
  {
   if (e instanceof ArithmeticException)
   {
    System.out.println("Can not Divide by Zero");
   }
   else if(e instanceof InputMismatchException)
   {
    System.out.println("Plz Enter int value");
   }
  }
  System.out.println("End");
 }
}