class Circle
{
//attribute of circle
double radius,area;
//action of circle
void setRadius(double x)
 {
  radius=x;
 }
void calculateArea()
 {
 area=(3.14)*(radius*radius);
 System.out.println("Area is: "+area);
 }
}

public class DemoClass1
{
 public static void main(String[] args)
 {
  Circle ob1=new Circle();
  Circle ob2=new Circle();
  ob1.setRadius(1.2f);
  ob2.setRadius(3.4f);
  ob1.calculateArea();
  ob2.calculateArea();
 }
}