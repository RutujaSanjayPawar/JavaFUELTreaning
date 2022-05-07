/*Q9.Write a program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.*;
class CalGrossSalary
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Basic Salary:");
 double BasicSal=sc.nextDouble();
 //System.out.println("Enter HRA: ");
 //double hra=sc.nextDouble();
 //System.out.println("Enter DA: ");
 
 if(BasicSal<=10000)
 {
  double hra=BasicSal*(20/100.00);
  double da=BasicSal*(80/100.00);
  double gs=BasicSal+hra+da;
  System.out.println("Gross Salary is: "+gs);
 }
 else if(BasicSal<=20000)
 {
  double hra=BasicSal*(25/100.00);
  double da=BasicSal*(90/100.00);
  double gs=BasicSal+hra+da;
  System.out.println("Gross Salary is: "+gs);

 }
 else if(BasicSal>20000)
 {
  double hra=BasicSal*(30/100.00);
  double da=BasicSal*(95/100.00);
  double gs=BasicSal+hra+da;
  System.out.println("Gross Salary is: "+gs);

 }

 }
}

/*hra = bs * (20/100.00);  
   da  = bs * (40/100.00);  
  
    gs  = bs + hra + da; */