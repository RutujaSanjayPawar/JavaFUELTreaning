/*Q8 Write a  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
import java.util.*;
class PercentageAndGrade
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter Physics Marks:");
  double phy=sc.nextDouble();
   System.out.println("Enter Chemistry Marks:");
  double che=sc.nextDouble();
   System.out.println("Enter Biology Marks:");
  double bio=sc.nextDouble();
   System.out.println("Enter Mathematics Marks:");
  double math=sc.nextDouble();
   System.out.println("Enter Computer Marks:");
  double comp=sc.nextDouble();
  
  double Percentage =((phy+che+bio+math+comp)/5);
  
  if(Percentage >= 90)
  {
   System.out.println( "Percentage is "+Percentage +" and Grade is A");
  }
  else if(Percentage >= 80)
  {
   System.out.println("Percentage is "+Percentage +" and Grade is B");
  }
 else if(Percentage >= 70)
  {
   System.out.println( "Percentage is "+Percentage +" and Grade is c");
  }

  else if(Percentage < 40)
  {
   System.out.println("Percentage is "+Percentage +" and Grade is D");
  }
  else if(Percentage >= 40)
  {
   System.out.println( "Percentage is "+Percentage +" and Grade is E");
  }
 else if(Percentage >= 90)
  {
   System.out.println("Percentage is "+Percentage +" and Grade is F");
  }

 }
}