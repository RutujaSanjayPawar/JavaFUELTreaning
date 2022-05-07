//string reference

public class StringRef
{
 public static void main(String[] args)
 {
  String s1="abc";  //same refrence variable object same memory allocation
  String s2="abc";
  if(s1==s2)
  {
   System.out.println("Equals");
  }
  else
  {
  System.out.println("Not Equals");
  }
 }
}