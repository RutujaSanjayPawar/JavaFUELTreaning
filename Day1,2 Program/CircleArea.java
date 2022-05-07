/* WAP*/
import java.util.*;
class CircleArea        //Formula A=pai*r^2

{
public static void main(String args[])
  {
  double r,area;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter Radius: ");
  r=sc.nextDouble();
 
  area=3.14*(r*r);
  
  System.out.println("Area of Circle is:"+area);
  }
}