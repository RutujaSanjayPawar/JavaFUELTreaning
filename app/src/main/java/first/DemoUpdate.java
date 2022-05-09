package first;
import java.sql.*;
import java.util.*;

public class DemoUpdate 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(new App().getGreeting());
        
              // Load database driver in memory
              Scanner sc=new Scanner(System.in);
        
              System.out.println("Enter Student Id :");
              
              int id=sc.nextInt();
              
            //   System.out.println("Enter Student Name :");
              
            //   String name=sc.next();
              
                     
              
              Class.forName("org.postgresql.Driver");
              System.out.println("Driver Loaded");
      
              Connection conn;
              conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
      
                      System.out.println("Connection done");
              Statement stmt;
              stmt=conn.createStatement();
              String sql;
              sql="update student1 set name = 'testing' where id="+id+ "";
              stmt.executeUpdate(sql);
              System.out.println("record Updated");
              conn.close();


    }
    
}
