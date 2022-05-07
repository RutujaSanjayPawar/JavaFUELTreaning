/* Q1. WAP to convert Temperature fehrenheit into celsius  */
import java.util.*;
class temp
{
public static void main(String args[])
{
double cel,fer;
Scanner sc= new Scanner(System.in);
System.out.println("Enter Temprature in fehrenheit:");
fer=sc.nextDouble();
cel=(fer-32.0)*5.0/9.0;
System.out.println("Temprature converted into celsius:"+cel);
}
}