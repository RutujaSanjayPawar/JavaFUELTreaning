//why we need abstract class
//need of abstract class
abstract class Account
{
 void getCustInfo()
 {
  System.out.println("Get cust info");
 }
 abstract void calculateInterest();
}
class Saving extends Account
{
 @Override
 void calculateInterest()
 {
  System.out.println("Calculate interest of saving");
 }
}
class Loan extends Account
{
@Override
void calculateInterest()
{
 System.out.println("Calculate Interest of Loan");
}
}
public class DemoNeedAbstract
{
 public static void main(String[] args)
 {
  Account r;
  r=new Saving();
  r.calculateInterest();
  r=new Loan();
  r.calculateInterest();
 }
}