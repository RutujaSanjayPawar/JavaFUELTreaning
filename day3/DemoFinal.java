import java.util.Scanner;
class DemoFinal
{
 public static void main(String args[])
 {
 
   int age;
   String name;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Name and Age");
   name=sc.next();
   age=sc.nextInt();
   if(age>=18)
   {
     System.out.println("You can cast a voat");
   }
   else
   { 
    System.out.println("You can not cast a voat");
   }
 }
}

