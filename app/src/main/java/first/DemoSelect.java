package first;
import java.sql.*;
import java.util.*;

public class DemoSelect 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(new App().getGreeting());
        
              // Load database driver in memory
              //Scanner sc=new Scanner(System.in);
        
              //System.out.println("Enter Student Id :");
              
              //int id=sc.nextInt();
              
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
              sql="select * from student1 where id=55";

              ResultSet rs;
              rs=stmt.executeQuery(sql);
              if(rs.next()){
              System.out.println("Record Found");
              }else{
              System.out.println("Record not found");
           }
          conn.close();



    }
    
}
