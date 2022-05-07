/*Q5.Write a   program to input any alphabet and check whether it is vowel or consonant*/
import java.util.*;
class VowelConsonant 
{

    public static void main(String args[]) 
    {

     char ch= 'a';
   //String name;
   Scanner sc=new Scanner(System.in);
   //System.out.println("Enter Name and Age");
   //ch=sc.next();


        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}