/*Q3.WAP convert meter to feet and inches 
1 meter=3.28084 feet
1 meter=39.37 inches*/

import java.util.Scanner;   
class feet_into_inches 
{ 
public static void main(String args[])
{
   double inch,feet;
   double meter=3;
   Scanner sc=new Scanner(System.in);
   inch  = 39.37 * meter;   
   feet = 3.28084 * meter;   
   System.out.printf(" meter in Inches is: %.2f \n", inch);   
   System.out.printf("meter in Feet is: %.2f", feet);
}
}


