/*Q4.Write a program that asks the user to enter a word. The program then writes that word one 
character per line: 
Enter a word: turtle
t
u
r
t
l
e
Use the length() method that counts the number of characters in a string and the charAt( int 
index ) that returns the character at index. Recall that String indexes start at zero*/
import java.util.*;
class WordNewLine
{
public static void main(String args[])
{
String s="Rutuja";
for(int i=0; i<=s.length()-1; i++) 
{
System.out.println(s.charAt(i));
}
}
}