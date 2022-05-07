// objectOutputStream

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
  private int id;
  private String name;
  public int getId()
  {
   return id;
  }
  public void setId(int id)
  {
   this.id=id;
  }
  public String getName()
  {
   return name;
  }
  public void setName(String name)
  {
   this.name=name;
  }
  
}

public class DemoStudent
{
 public static void main(String[] args)throws Exception
 {
  Student st;
  st=new Student();
  st.setId(45236);
  st.setName("Rutuja");
  FileOutputStream fout;
  fout=new FileOutputStream("C:\\JAVA_Programming\\Day17\\studinfo.txt");
  
  ObjectOutputStream out;
  
  out=new ObjectOutputStream(fout);
  out.writeObject(st);
  
  out.close();
 }
}