// split
public class DemoSplit
{
 public static void main(String[] args)
 {
  String s1="This is demo string";
  
  String[] arr=s1.split(" ");
  for(String s2:arr)
  {
   System.out.println(s2.toUpperCase());
   System.out.println(s2.toLowerCase());
  }
 }
}