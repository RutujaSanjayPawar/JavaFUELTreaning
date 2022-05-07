/*Q7 Swap 2 Numbers value
Input a=10,b=20 */
import java.util.*;  
class Swap_With {  
    public static void main(String[] args) {  
       int a, b, temp;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of a and b");  
       a = sc.nextInt();  
       b = sc.nextInt();  
       System.out.println("Before swapping numbers: "+a +"  "+ b);  
       /*swapping */  
       temp = a;  
       a = b;  
       b = temp;  
       System.out.println("After swapping: "+a +"   " + b);  
       System.out.println( );  
    }    
}  