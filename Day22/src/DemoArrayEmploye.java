/*Q4.Create an ArrayList of Employee( id,name,address,sal) objects and
search for particular Employee object based on id number*/

import java.util.*;
class Employee1
{
  private int id;
  private String name;
  private String address;
  private int sal;

  Employee1(int id,String name,String address,int sal)
  {
      super();
      this.id=id;
      this.name=name;
      this.address=address;
      this.sal=sal;
  }
  public int getId()
  {
      return id;
  }
  @Override
    public String toString()
  {
      return "Employee [Id="+id+ ", Name="+name +", Address= "+address+", Salary= "+sal+"]";
  }
}
public class DemoArrayEmploye
{
  public static void main(String[] args)
  {
      ArrayList<Employee1> arr=new ArrayList<>();

      arr.add(new Employee1(11,"Rutuja","Aurangabad",10000));
      arr.add(new Employee1(12,"Pooja","Vaijapur",10000));
      arr.add(new Employee1(13,"Pratima","Nagar",12000));
      arr.add(new Employee1(14,"Pallavi","Nashik",10000));
      arr.add(new Employee1(15,"Rutuja","Pune",11000));

      Iterator<Employee1> it =arr.iterator();
      System.out.println();
      System.out.println("Enter Employee you want to Search:");
      Scanner sc=new Scanner(System.in);
      int searchId =sc.nextInt();

      while (it.hasNext())
      {
          Employee1 empinfo=it.next();
          if (empinfo.getId()==searchId)
          {
              System.out.println(empinfo);
          }
      }

  }
}
