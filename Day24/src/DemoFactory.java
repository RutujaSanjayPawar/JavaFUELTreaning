abstract class Account
{
    void getCustInfo()
    {
        System.out.println("Get Cust Information");
    }
    abstract void calculateInterest();
}
class Saving extends Account
{
    @Override
    void calculateInterest()
    {
        System.out.println("Calculate Interest of Saving");
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
class AccountFactory
{
    public static Account getAccount(String type)
    {
        Account obj=null;
        if(type.equalsIgnoreCase("saving"))
        {
            obj=new Saving();
        }
        else
        {
            obj=new Loan();
        }
        return obj;
    }
}
public class DemoFactory
{
    public static void main(String[] args)
    {
        Account ob1=AccountFactory.getAccount("Loan");
        ob1.calculateInterest();
        ob1=AccountFactory.getAccount("Saving");
        ob1.calculateInterest();
    }
}
