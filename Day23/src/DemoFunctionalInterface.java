@FunctionalInterface
interface A1<T>
{
    T add(T x,T y);
}
public class DemoFunctionalInterface
{
   public static void main(String[] args)
   {
       A1<Integer> ob=(x, y) -> x+y;
       System.out.println(ob.add(200,300));
   }

}
