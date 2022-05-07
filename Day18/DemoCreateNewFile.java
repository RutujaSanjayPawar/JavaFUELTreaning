//File Class
import java.io.*;
public class DemoCreateNewFile {
    public static void main(String[] args) throws Exception {
        
        File f1;
        f1=new File("C:\\JAVA_Programming\\Day18\\files");
        // String[] arr;
        // arr=f1.list();
        // for (String fname : arr) {
        //     System.out.println(fname);
            
        // }

        File[] arr1;
        arr1=f1.listFiles();
        for (File f3 : arr1) {
            if(f3.isFile()){
                System.out.println("File:"+f3.getName());
            }
            else if(f3.isDirectory()){
                System.out.println("Dir:"+f3.getName());
            }
            
            File f4=new File("C:\\JAVA_Programming\\a");
            f4.mkdir();
            //File f4=new File("C:\\JAVA_Programming\\Day18\\a\\b\\c");
            //f4.mkdirs();
        }    

    }
}

