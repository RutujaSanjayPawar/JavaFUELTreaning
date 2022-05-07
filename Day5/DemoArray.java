import java.util.*;
class DemoArray
{
public static void main(String args[])
{
 
 Scanner sc=new Scanner(System.in);
 //Declare int array of size is 5
 int i;
 int[] arr=new int[5];
 System.out.println("Enter Array:");
 
 for(i=0;i<arr.length;i=i+1)
 {
  arr[i]=sc.nextInt();
 }
 System.out.println("Your Array is:");
 
 for(i=0;i<arr.length;i=i+1);
 {
   System.out.println(arr[i]);
 }
}
}