import java.util.*;
class DemoArray2
{
 public static void main(String[] args)
 {
 int[] [] arr=new int[3][3];
 Scanner sc=new Scanner(System.in);
 int i,j;
 System.out.println("Enter Your Array:");
 for(i=0;i<3;i=i+1)
 {
  for(j=0;j<3;j=j+1)
  {
   arr[i][j]=sc.nextInt();
  }
 }
 System.out.println("Your Array:");
 
 for(i=0;i<3;i=i+1)
 {
    for(j=0;j<3;j=j+1)
   {
   System.out.print(" "+arr[i][j]);
   }
   System.out.println();

 }
 
 }
}