//Write a   program to calculate profit or loss.
import java.util.*;
class ProfitandLoss
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Cost Price");
 double cp=sc.nextDouble();
 System.out.println("Enter Selling Price");
 double sp=sc.nextDouble();
 
 if(cp-sp>0)
 {
 System.out.println("Loss:"+(cp-sp));
 }
 else if(cp-sp<0)
 {
  System.out.println("Profit:"+(sp-cp));
 }
 }
}