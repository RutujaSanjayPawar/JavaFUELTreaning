
/*Q4. Create a class that captures students. Each student has a first name, last name, class year, and major. 
Declare these variables as private and provide getter and setter methods for these variables
Create two examples of students(means create 2 objects of Student class). 

NOTE : Do not take input from keyboard. Set the values by using setter method and to get values use getter method

*/

class Student
{
 String fname,lname,major;
 int year;
 
 // Private Student(String f,String l,int y ,String m)
//  {
//  fname=f;
//  lname=l;
//  year=y;
//  major=m;
//  }


 
 public void setFname(String fname)
 {
  this.fname=fname;
 }
 public void setLname(String lname)
 {
  this.lname=lname;
 }
 public void setYear(int year)
 {
  this.fname=fname;
 }
public void setMajor(String major)
 {
  this.major=major;
 }
public String getFname()
{
 return fname;
}
public String getLname()
{
 return lname;
}
public int getYear()
{
 return year;
}
public String getMajor()
{
 return major;
}

 
 void show()
 {
 System.out.println(getFname+" "+getLname+" "+getYear+" "+getMajor);
 }

}
public class DemoStudent
{
public static void main(String[] args)
{ 
 Student st1=new Student();
 
 Student st2=new Student();
 // st1.insertInfo("Student 1:"+"Rutuja","Pawar",2022,"E&TC");
//  st2.insertInfo("Student 2:"+"Pallavi","Pawar",2024,"CSE");
 st1.show("Student 1:"+"Rutuja","Pawar",2022,"E&TC");
 st2.show("Student 2:"+"Pallavi","Pawar",2024,"CSE");
}
}