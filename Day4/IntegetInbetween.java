/*Q1.Write a program that asks the user for a starting value and an ending value and then writes all the 
integers (inclusive) between those two values. 
Enter Start:
5
Enter End:
9
5
6
7
8
9*/
import java.util.*;
class IntegetInbetween
{
public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Start: ");
    int start = scan.nextInt();
    System.out.println("Enter Start:");

    int end = scan.nextInt();

    if(start < end)
    {
       { 
         for(int i = start; i <= end; i++)
         System.out.print(i + " ");
       }
    }
    else if(start > end)
    {
        for(int i = start; i >= end; i--)
        {
          System.out.print(i + " "); 
        } 
    }
}
}