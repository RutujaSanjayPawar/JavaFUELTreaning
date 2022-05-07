class demo2
{
 public static void main(String[] args)
 {
  //boxing
  int x=102;
  Integer ob=new Integer(x);
  
  //unboxing
  int y;
  y=ob.intValue();
  
  //Autoboxing
  int p=104;
  Integer ob2=p;
  
  //AutoUnboxing
  int q;
  q=ob2;
 }
}