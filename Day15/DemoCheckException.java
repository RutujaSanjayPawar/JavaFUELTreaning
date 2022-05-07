import java.io.FileInputStream;
import java.io.FileNotFoundException;

//checked exception
//unchecked exception

class DemoCheckException
{
 static void fun1() throws FileNotFoundException
 {
  try
  {
   FileInputStream fin;
   fin=new FileInputStream("c:/DemoFinallyBlock.txt");
  }
  catch(FileNotFoundException e)
  {
  throw e;
  }
 }
 public static void main(String[] args)
 {
  fun1();
 }
}