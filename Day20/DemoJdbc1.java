import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
public class DemoJdbc1
{
    public static void main(String[] args) throws Exception
    {
        // Load database driver in memory
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Student Id :");
        
        int id=sc.nextInt();
        
        System.out.println("Enter Student Name :");
        
        String name=sc.next();
        
               
        
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");

        Connection conn;
        conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");

                System.out.println("Connection done");
        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student1 values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");
        conn.close();
    }
}
