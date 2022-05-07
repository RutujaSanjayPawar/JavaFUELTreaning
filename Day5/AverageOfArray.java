/*Write a Java program to calculate the average value of array elements. */

class AverageOfArray
{
public static void main(String[] args)
{
 double i;
 double sum=0;
 double avg;
 double[] arr={19, 12.89, 16.5, 200, 13.7};
 for(i=0; i<arr.length;i++)
  {
   sum=sum+i;  
  }
  avg=sum/(arr.length);
 
 System.out.println("Average of Array is : "+avg);
 }
} 
