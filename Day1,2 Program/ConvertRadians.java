/*Exercise 7

It is sometimes hard to think in terms of radians; we would rather use degrees. Remember (from 
those dark days of trigonometry class) that there are PI radians per 180 degrees. So to convert an 
angle given in degrees to radians do this:
 
rad = degrees * Math.PI/180

Math.PI gives you an accurate value of PI. 
Edit the previous program so that it does the same things, but the angle is 30 degrees (which you 
will convert into radians.)*/

class ConvertRadians
{

 public static void main(String args[])
 {
  double rad;
  double degrees=30;
  rad=degrees*(Math.PI/180);
  System.out.println("Radians is : "+rad);
 }
}