package demo;
import java.sql.*;

public class StudImpl implements StudInterface
{
    @Override
  public void save(Student st)
  {
    String sql="";
    String name=st.getName();
    int id=st.getId();
    sql="insert into Student1(id,name) values("+id+","+name+")";
    try{
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver Loaded");
    
      Connection conn;
      conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
    
      System.out.println("Connection done");
      Statement stmt;
            
      //String sql;
      //sql="update student1 set name = 'testing' where id="+id+ "";
      stmt=conn.createStatement();
      stmt.executeUpdate(sql);
      System.out.println("record is Saved");
      conn.close();
    }catch(Exception e)
    {

    }

  }   
 @Override
 public void update(Student st)
 {
    String sql="";
    String name=st.getName();
    int id=st.getId();
    sql="update Student1 set name='"+name+"'where id='"+id;
    try{
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");
      
        Connection conn;
        conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
      
        System.out.println("Connection done");
        Statement stmt;
              
        //String sql;
        //sql="update student1 set name = 'testing' where id="+id+ "";
        stmt=conn.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("record Updated");
        conn.close();

    }catch(Exception e)
    {
        
    }

 }   
 @Override
 public void delete(Student st)
 {
    String sql="";
    //String name=st.getName();
    int id=st.getId();
    sql="delete from student1 where id = "+id+"";
    try{
    Class.forName("org.postgresql.Driver");
    System.out.println("Driver Loaded");
      
    Connection conn;
    conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
      
    System.out.println("Connection done");
    Statement stmt;
    stmt=conn.createStatement();
    //String sql;
    

    stmt.executeUpdate(sql);
    System.out.println("record Deleted");
    conn.close();
    }catch (Exception e) {

    } 
 }   
 @Override
 public void select(Student st)
 {
    String sql="";
    //String name=st.getName();
    //int id=st.getId();
    sql="select * from student1 where id=55";
    try{
    Class.forName("org.postgresql.Driver");
    System.out.println("Driver Loaded");
      
    Connection conn;
    conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test2","postgres","root");
      
    System.out.println("Connection done");
    Statement stmt;
    stmt=conn.createStatement();
    //String sql;
   

    ResultSet rs;
    rs=stmt.executeQuery(sql);
    if(rs.next()){
    System.out.println("Record Found");
     }else
     {
      System.out.println("Record not found");
      }
    conn.close(); 
    } catch (Exception e)
    {

    }     
 }  
 @Override
 public Student getStud(int id)
 {  
      // TODO Auto-generated method stub

      String sql;
      sql = "SELECT * FROM student1 where id=" + id;
      Student st = null;
      try {
          Class.forName("org.postgresql.Driver");
          System.out.println("Driver loaded");
          Connection conn;
          conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
          System.out.println("Coonection done");
          Statement stmt; 
          stmt = conn.createStatement();
          ResultSet rs;
          rs = stmt.executeQuery(sql);
          // rs.next();
          // System.out.println(rs.getInt(1));
          // System.out.println(rs.getString(2));
          // System.out.println("Select sucessfully");
          int count = 1;

          while (rs.next()) {
              System.out.print(count + "]" + " " + rs.getInt(1));
              System.out.print(":  ");
              System.out.println(rs.getString(2));
              st = new Student();
              st.setId(rs.getInt(1));

              count++;
           }
          System.out.println("\t\t  Successfully Select Query Execuated !");

      } catch (Exception e) {
          // TODO: handle exception
      }

      return st;
  }
 }   
    

