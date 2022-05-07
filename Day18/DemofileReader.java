//FileReader

import java.io.*;
public class DemofileReader
{
 public static void main(String[] args)throws Exception
 {
  FileReader fin;
  fin=new FileReader("C:\\JAVA_Programming\\Day18\\test");
  BufferedReader bin;
  bin=new BufferedReader(fin);
  String s1="";
  while((s1=bin.readLine())!=null)
  {
   System.out.println(s1);
  }
  bin.close();
 }
}