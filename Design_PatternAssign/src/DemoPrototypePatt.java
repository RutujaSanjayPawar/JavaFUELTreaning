import java.util.ArrayList;

class Village implements Cloneable
{
    ArrayList<String> arr;

    Village()
    {
        arr=new ArrayList<>();
    }
    Village(ArrayList<String> t)
    {
        arr=t;
    }
    void loadData()
    {
        arr.add("House 1 Data");
        arr.add("House 2 Data");
        arr.add("House 3 Data");
        arr.add("House 4 Data");
        arr.add("House 5 Data");
    }
    void show()
    {
        System.out.println("----------------------");
        for(String s:arr)
        {
            System.out.println(s);
        }
        System.out.println("-----------------------");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        ArrayList<String> arr2;
        arr2 =new ArrayList<>();
        for (String v:arr)
        {
            arr2.add(v);
        }
        Village obj=new Village(arr2);
        return obj;
    }
}
public class DemoPrototypePatt
{
  public static void main(String[] args)throws Exception
  {
      Village v1=new Village();
      v1.loadData();
      v1.show();
      Village v2=(Village) v1.clone();

      v2.show();
      v2.arr.remove("House 3 Data");
      System.out.println("**v1 Object**");
      v1.show();
      System.out.println("**v2 Object**");
      v2.show();
  }
}
