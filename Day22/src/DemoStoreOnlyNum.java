/*Q3.Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not any
other data type.
*/
import java.util.*;
public class DemoStoreOnlyNum
{
    public static void main(String[] args)
    {
        ArrayList<Object> arr;
        arr=new ArrayList<>();

        System.out.println("Your Array is: ");

        arr.add(12);
        arr.add(1.2);
        arr.add(64);
        arr.add(2D);

        System.out.println(arr);



    }
}
