package first;
import java.sql.*;
//import java.util.*;

public class InsertBY 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(new App().getGreeting());
        
              // Load database driver in memory
                     
              
              Class.forName("org.postgresql.Driver");
              System.out.println("Driver Loaded");
      
              Connection conn;
              conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
      
              System.out.println("Connection done");
            
              String sql;
              sql= "insert into student1 values(?,?)";
        
               PreparedStatement stmt;
               stmt=conn.prepareStatement(sql);
               stmt.setInt(1, 1500);
               stmt.setString(2, "ttt");
               stmt.executeUpdate();

                conn.close();



    }
    
}
