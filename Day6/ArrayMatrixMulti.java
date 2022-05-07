import java.util.*;
class ArrayMatrixMulti
{
public static void main(String[] args)
 {
  int[][] arr=new int[4][4];
  int[][] arr1=new int[4][4];
  Scanner sc= new Scanner(System.in);
  int i,j;
  int[][] multi=new int[4][4];
  System.out.println("Enter Your Array is:");
  
  for(i=0;i<4;i=i+1)
  {
   for(j=0;j<4;j=j+1)
   {
    arr[i][j]=sc.nextInt();
   }
   System.out.println();
  }
 System.out.println("Enter Your Array2 is");
 for(i=0;i<4;i=i+1)
 {
  for(j=0;j<4;j=j+1)
  {
  arr1[i][j]=sc.nextInt();
  }
  System.out.println();
 }
 
 System.out.println("Matrix Multiplication is:");
 for(i=0;i<4;i=i+1)
 {
  for(j=0;j<4;j=j+1)
  {
   multi[i][j]=arr[i][j]*arr1[i][j];
   System.out.print(" "+multi);
  }
  System.out.println();
 }

 
 }
}