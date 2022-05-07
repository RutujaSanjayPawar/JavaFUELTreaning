//Write a Java program to sort values of  array elements. 

class SortAscanding
{
 public static void main(String[] args)
 {
 //Initialize array
 int[] arr=new int[]{2,6,4,1,8,0};
 int temp=0;
 
 //Display the elements of Original array
 System.out.println("Elements of Original array:");
 
 for(int i=0;i<arr.length;i++)
 {
  System.out.print(arr[i]+" ");
 }
 
 //Sorting the array in ascending order
 for(int i=0;i<arr.length;i++)
 {
  for(int j=i+1;j<arr.length;j++)
  {
   if(arr[i]>arr[j])
   {
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
  }
 }
 System.out.println();
 //Display element of array after sorting
 System.out.println("Elements of Array Sorted in ascending order:");
 for(int i=0;i<arr.length;i++)
 {
  System.out.print(arr[i]+" ");
 }
 
 
 }
}