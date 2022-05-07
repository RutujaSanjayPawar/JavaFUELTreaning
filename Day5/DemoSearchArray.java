import java.util.*;
class DemoSearchArray
{
 public static void main(String args[])
 {
  int i,item;
  Scanner sc=new Scanner(System.in);
  //declear int array of size 5
  int[] arr={1,2,3,3,4,5,4,6,8,9};
  boolean isFound=false;
  //System.out.println(arr.length);
  System.out.println("Enter Item to Search:");
  item=sc.nextInt();
  
  for(i=0;i<arr.length;i=i+1)
  {
  if(item==arr[i])
  {
   isFound=true;
   break;
  }
  }
 if(isFound==true)
 {
 System.out.println("Item Found");
 }
 else
 {
 System.out.println("Item is Not Found");
 }
 }
}