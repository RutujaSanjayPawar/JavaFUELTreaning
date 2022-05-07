/*Q10.Write program to find the sum of first and last digit of any number(number may contain 
3 digit,4 digit or 5 digit)*/

import java.util.*; // import util package for input 
class add_first_last 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); //creating an object for input 
        System.out.println("Enter a number: "); 
        int a = sc.nextInt(); // input 
        int last = (int)(a%10); // finding the last digit 
        int d; 
        int first=0; 
        while(a>0) 
        { 
            d = a%10; //extracting the digits one by one 
            if((a/10)==0) //condition for finding the first digit 
            { 
                first = d; //storing the first digit in a variable 
            } 
            a=a/10; 
             
        } 
        System.out.println(first+last); 
         
    } 
} 