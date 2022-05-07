import java.util.*;
class DemoArray2Initi
{
 public static void main(String[] args)
 {
 int[] [] arr={{10,20,30},{40,50,60},{70,80,9}};
  int i,j;

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