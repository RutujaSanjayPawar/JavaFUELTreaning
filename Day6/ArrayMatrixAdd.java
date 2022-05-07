class ArrayMatrixAdd
{
 public static void main(String[] args)
 {
  int[][] arr={{1,2,3},{4,6,7},{7,8,9}};
  int[][] arr1={{1,2,3},{4,6,7},{7,8,9}};
  int i,j;
  int sum[][]=new int[3][3];
  
  System.out.println("Your Array is:");
  for(i=0;i<3;i=i+1)
  {
    for(j=0;j<3;j=j+1)
    {
     System.out.print(" "+arr[i][j]);
    }
    System.out.println();
  }
  System.out.println("Your Array1 is:");
  for(i=0;i<3;i=i+1)
  {
    for(j=0;j<3;j=j+1)
    {
     System.out.print(" "+arr1[i][j]);
    }
    System.out.println();
  }
 System.out.println("Matrix Addition is:");
 for(i=0;i<3;i=i+1)
 {
  for(j=0;j<3;j=j+1)
  {
   sum[i][j]=arr[i][j]+arr1[i][j];
   System.out.print(" "+sum[i][j]);
  }
  
  System.out.println();
 }
 }
}