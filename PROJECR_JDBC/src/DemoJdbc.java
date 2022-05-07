import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DemoJdbc
{
    public static void main(String[] args) throws Exception
    {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");

        Connection conn;
        conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");

                System.out.println("Connection done");
        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student1 values(500,'testing')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");
        conn.close();
    }
}
