//WAP to check that Enter Matrix is upper trangular or not
/*import java.util.Scanner;
class UppreTrangularOrNot
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int i,j;
  int n=4;
  int[][] arr=new int[4][4];
  
  System.out.println("Your Matrix is:");
  for(i=0;i<4;i=i+1)
  {
   for(j=0;j<4;j=j+1)
   {
   arr[i][j]=sc.nextInt();
   
   }
   System.out.println();
  }
  System.out.println("Check this");
  for(i=1;i<n;i++)
  {
   for(j=0;j<i;j++)
   
    for(arr[i][j]!=0)
    {
     System.out.println("Mattrix is Upper Trangular");
    }
    else
    {
    System.out.println("Mattrix is lower Trangular");
    }
  }
  
  
  
 }
}
*/
import java.util.*;
public class Main
{
	public static void main(String[] args)
		{
			int n, flag = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter the order of the matrix :");
			n = sc.nextInt();
			int[][] mat1 = new int[n][n];
			System.out.print("\nInput the matrix elements : \n");
			int i, j;
			for(i = 0; i < n; i++)
				{
					for(j = 0; j < n; j++)
						mat1[i][j] = sc.nextInt();
				}
			for (i = 1; i < n; i++)
				for (j = 0; j < i; j++)
					if (mat1[i][j] != 0)
						flag = 0;
					else		
						flag = 1;
	
			if (flag == 1)
				System.out.println("Upper Triangular Matrix");
			else
				System.out.println("Not an Upper Triangular Matrix");
	
			}
  }