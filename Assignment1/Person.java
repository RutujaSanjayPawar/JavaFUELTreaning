/*Q5.  Create a class called Person with a member variable first_ name and last_name.
 Save it in a file called Person.java 
Create a class called Teacher who will inherit the Person class. 
The other data members of the Teacher class are annual salary (double), 
the year the teacher started to work, and number of years of experience which is int.
 Save this in a file called Teacher.java 

NOTE :Your class should have a constructor in base class and derived class. Use getter methods to show values.
*/

class Person
{
  String fname;
  String lname;

}
class Teacher extends Person
{
 double salary;
 int StartYear;
 int YearExp;
}