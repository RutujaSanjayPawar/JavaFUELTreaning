
import java.util.Scanner;

//equals,equalsIgnoreCase,trim

public class DemoEqualsTrim
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter UserName");
  String un=sc.nextLine();
  System.out.println("Enter Password");
  String pass=sc.nextLine();
  un=un.trim();
  pass=pass.trim();
  
   //if(un.equals("abc")&& pass.equals("xyz"))
   //{
   // System.out.println("Valid");
   //}
   //else
   //{
    //  System.out.println("InValid")
   //}   
   
   if(un.equalsIgnoreCase("abc")&& pass.equalsIgnoreCase("xyz"))
   {
    System.out.println("Valid");
   }
   else
   {
    System.out.println("Invalid");
   }
   
 }
}