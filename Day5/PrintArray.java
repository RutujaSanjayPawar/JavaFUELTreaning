
/*JAVA Array
1. Write a program   to store elements in an array and print it. 
Test Data : 
Input 10 elements in the array : 
element - 0 : 1 
element - 1 : 1 
element - 2 : 2 
....... 
Expected Output : 
Elements in array are: 1 1 2 3 4 5 6 7 8 9 
*/
class PrintArray
{
public static void main(String[] args)
{
 int[] arr=new int[]{1,1,2,3,4,5,6,7,8,9};
 System.out.println("Elements in Array are:");
 
 for(int i=0;i<arr.length;i++)
 {
 System.out.print(arr[i]+" ");
 }
}
}