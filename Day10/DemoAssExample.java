//Assignments Example
//complete this with Constructor

class Person
{
 String name;
 String address;
 Person(String name,String address)
 {
  this.name=name;
  this.address=address;
 }
 String getName()
 {
  return name;
 }
 String getAddress()
 {
  return address;
 }
}
class Student extends Person
{
 int sid;
 Student(int sid,String name,String address)
 {
 super(name,address);
 this.sid=sid;
 } 
 int getSid()
 {
 return sid;
 }
}
class Teacher extends Person
{
 int tid;
 double salary;
 String subject;
 Teacher(String name,String address,int tid,double salary,String subject)
 {
 super(name,address);
 this.tid=tid;
 this.salary=salary;
 this.subject=subject;
 }
 int getTid()
 {
  return tid;
 }
 double getSalary()
 {
  return salary;
 } 
 String getSubject()
 {
  return subject;
 }
}
class CollegeStudent extends Student
{ 
 int year;
 String major;
CollageStudent(int sid,String name,String address,int year,String major);
{
 super(sid,name,address);
 this.year=year;
 this.major=major;
 }
  String getMajor()
 {
  return major;
 }
 int getYear()
 {
 return year;
 }
 void show()
 {
 system.out.println("Student id: ",+getSid);
 system.out.println("Name: "+getName);
 system.out.println("Major"+major);
 system.out.println("Year:"+year);
 system.out.println("Address:"+getAddress);
 
 }
}

public class DemoAssExample
{
 public static void main(String[] args)
 {
 CollageStudent cs;
 cs=new CollageStudent(1,"Rutuja","E&TC",2022,"Gajanan Nagar");
 cs.show();
 }
}
