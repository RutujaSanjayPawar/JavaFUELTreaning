import java.io.*;
public class DemoIO3 {
    public static void main(String[] args)throws Exception {
       
        FileInputStream fin;
        fin=new FileInputStream("C:\\JAVA_Programming\\Day16\\Demo.txt");
       
        FileOutputStream fout;
        fout=new FileOutputStream("C:\\JAVA_Programming\\Day16\\demo1.txt");
        int x;
        System.out.println(fin.available());       
        do{
            x=fin.read();
            if(x!=-1){
                fout.write(x);
            }
        }while(x!=-1);
        fin.close();
        System.out.println("File Copied");
        
    }
}