//3 Write a Program that take 5 numbers into array and print square value of each number
public class DemoArray 
{
    public static void main(String[] args)
    {
        int i;
        int Square;
        int[] arr={1,2,3,4,5}; 
        
        for(i=0;i<arr.length;i=i+1)
        {
            Square=arr[i]*arr[i];
            //System.out.println("Array Square Value is:");
            System.out.print(" "+Square);
        }
        System.out.println();
    }
}
