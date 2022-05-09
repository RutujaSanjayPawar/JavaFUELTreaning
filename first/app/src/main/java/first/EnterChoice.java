package first;
import java.sql.*;
import java.util.*;

public class EnterChoice {
    public static void main(String[] args) throws Exception
    {
        System.out.println(new App().getGreeting());
        
              // Load database driver in memory
              Scanner sc=new Scanner(System.in);
           
              
              Class.forName("org.postgresql.Driver");
              System.out.println("Driver Loaded");
      
              Connection conn;
              conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
      
                System.out.println("Connection done");
              Statement stmt;
              stmt=conn.createStatement();

              System.out.println("Enter Choice for : \n1 - Insert Data\n2 - Delete Data\n3 - Update Data\n4 - Select Data\n5 - Exit");
               int choice;
               System.out.println("Enter Your Choice");
               choice=sc.nextInt();
                System.out.println("Enter Id"); 
                int id=sc.nextInt();  
                 System.out.println("Enter Name"); 
                String name=sc.next();
                String sql;
                if(choice==1){
                 sql="insert into Student1 values("+id+",'"+name+"')";
                 stmt.executeUpdate(sql);
                 System.out.println("Record is Inserted");
                 }else if(choice==2){
                 sql="delete from student1 where bnum="+id+"";
                 stmt.executeUpdate(sql);
                 System.out.println("Record is Deleted");
                 }else if(choice==3){
                sql="update student1 set name = 'Aaradhya' where id="+id+ "";
                 stmt.executeUpdate(sql);
                 System.out.println("Record is Updated");
                } else if(choice==4){
                 sql="select * from student";
                 stmt.executeUpdate(sql);
                 System.out.println("Record is Selected");
                 }else{
                 System.out.println("Number is Out Of Bound");
          }
            


    }
    
    
}
