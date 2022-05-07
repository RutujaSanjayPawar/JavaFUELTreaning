abstract class Account1
{
    abstract void calculateInterest();

}
class Saving1 extends Account1
{
  @Override
  void calculateInterest()
  {
      System.out.println("Calculate inerest of saving");
  }
}
class Loan1 extends Account1
{
    @Override
    void calculateInterest()
    {
        System.out.println("Calculate inerest of Loan");
    }
}
class AccountFactory1
{
    static Account1 getAccount(String type)
    {
        Account1 obj=null;
        if(type.equalsIgnoreCase("Saving"))
        {
            obj=new Saving1();
        }
        else if (type.equalsIgnoreCase("Loan"))
        {
            obj=new Loan1();
        }
        return obj;
    }
}
public class DemoFactory1
{
    public static void main(String[] args)
    {
        Account1 ob1=AccountFactory1.getAccount("loan");
        Account1 ob2=AccountFactory1.getAccount("saving");
        ob1.calculateInterest();
        ob2.calculateInterest();
    }
}
