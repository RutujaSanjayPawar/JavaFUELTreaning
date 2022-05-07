
abstract class Restorant
{
    abstract void calculateBill();
}
class RoomRent extends Restorant
{
    @Override
    void calculateBill()
    {
        System.out.println("Calculate Bill of RoomRent ");
    }
}
class Dinner extends Restorant
{
    @Override
    void calculateBill()
    {
        System.out.println("Calculate Bill of Dinner ");
    }
}
class RestorantFactory
{
    static Restorant getRestorant(String type)
    {
        Restorant obj=null;
        if(type.equalsIgnoreCase("RoomRent"))
        {
            obj=new RoomRent();
        }
        else if (type.equalsIgnoreCase("Dinner"))
        {
            obj=new Dinner();
        }
        return obj;
    }
}
public class DemoFactory
{
    public static void main(String[] args)
    {
        Restorant ob1=RestorantFactory.getRestorant("Dinner");
        Restorant ob2=RestorantFactory.getRestorant("RoomRent");
        ob1.calculateBill();
        ob2.calculateBill();
    }
}
