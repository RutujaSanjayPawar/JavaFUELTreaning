/*Create an abstract class Instrument which is having the abstract function play. Create three more sub 
classes from Instrument which is Piano, Flute, Guitar.

 Override the play method inside all three classes 
printing a message “Piano is playing tan tan tan tan ” for Piano class “Flute is playing toot toot toot toot” 
for Flute class “Guitar is playing tin tin tin ” for Guitar class You must not allow the user to declare an 
object of Instrument class. 

Create an array of 10 Instruments. Assign different type of instrument to 
Instrument reference. Check for the polymorphic behavior of play method. Use the instanceof operator 
to print that which object stored at which index of instrument array.

Abstract Classes*/
import java.util.*;
abstract class Instrument
{
 abstract public void play();
}
class Piano extends Instrument
{
 @Override
 public void play()
 {
  System.out.println("Piano is playing tan tan tan tan");
 }
}
class Flute extends Instrument
{
 @Override
 public void play()
 {
  System.out.println("Flute is playing toot toot toot toot");
 }


}
class Guitar extends Instrument
{
 @Override
 public void play()
 {
  System.out.println("Guitar is playing tin tin tin");
 }
}
class InstrumentArray
{
 public static void main(String[] args)
 {
 
  Instrument ins;
  ins=new Piano();
  ins.play();
  ins=new Flute();
  ins.play();
  ins=new Guitar();
  ins.play(); 
  
  int i;
  String instrument;
  Scanner sc=new Scanner(System.in);
  String[] arr={"Guitar","strings"," woodwind", "Piano","brass", "keyboards","Flute","Percussion","Woodwinds", "Brass"};
  boolean isFound=false;
  
  System.out.println("Enter Instrument:");
  instrument=sc.next();
  
  for(i=0;i<arr.length;i=i++)
  {
   if(instrument=="Guitar"||instrument=="Piano"||instrument=="Flute")
   {
    System.out.println(" "+ins);
   }
   else
   {
   System.out.println();
   }
   
  }
  System.out.println();
  
  
 }
}