package practice;
import java.util.Scanner;
public class Fibonacci_Series 
{
  public static void main(String args[])
    {
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter the limit:");
	   int lmt = input.nextInt();
	   int f = -1, l=1;
	   int sum;
	   for(int i=0;i<=lmt;i++)
	   {  
		  sum = f + l;
		  System.out.print(sum+"\t");
		  f = l;
		  l = sum;
	   }
    }
	   
}
