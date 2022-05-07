import java.util.Scanner;
class InputUser
{
public static void main(String args[])
{
   int a,b,c;
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter Two Numbers: ");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;
   System.out.println("Addition is "+c);
}
}