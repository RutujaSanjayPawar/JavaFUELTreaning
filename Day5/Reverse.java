/*Write a program   to read n number of values in an array and display it in reverse order. 
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7 
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */

class Reverse
{
 public static void main(String[] args)
 {
 int[] arr=new int[]{2,5,7};
 System.out.print("Oraginal Array is :");
 
 for(int i=0; i<arr.length;i++)
 {
  
  System.out.print(arr[i]+" ");
 }
 System.out.println();
 System.out.print("Reverse Array is: ");
 for(int i=arr.length-1; i>=0; i--)
 {
  System.out.print(arr[i]+" ");
 }
 
 }
}