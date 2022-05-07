

/*Q2.Create an ArrayList which will be able to store only Strings.
Create a printAll method which will print
all the elements using an Iterator.
*/
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoPrintAll
{
    public static void main(String[] args)
    {
        ArrayList<String> arr;
        arr=new ArrayList<>();
        System.out.println("Your String Array is: ");
        arr.add("Rutuja");
        arr.add("Pallavi");
        arr.add("Pratima");
        arr.add("Pooja");
        arr.add("Yash");
        arr.add("Sudarshan");

        Iterator<String> it;
        it=arr.iterator();

        while (it.hasNext())
        {
            System.out.print(" "+it.next());
        }
        System.out.println();
    }

}
