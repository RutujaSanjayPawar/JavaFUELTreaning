import java.io.*;
public class DemoIO2
{
 public static void main(String[] args)throws Exception
 {
  FileInputStream fin;
  fin=new FileInputStream("C:\\JAVA_Programming\\Day16\\Demo.txt");
  StringBuffer sb;
  sb=new StringBuffer();
  
  int x;
  System.out.println(fin.available());
  
  /* read() will get next available byte from file.if no data present then it will return -1*/
      // x=fin.read();
        // System.out.print((char)x);
        // x=fin.read();
        // System.out.print((char)x);
   do{
            x=fin.read();
            if(x!=-1)
            {
                sb.append((char)x);
            }
        }
        while(x!=-1);
        System.out.println(sb.toString());
        fin.close();
        System.out.println();
        
    }

}

    
