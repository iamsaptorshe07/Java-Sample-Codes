package practice;
import java.util.Scanner;
public class Factorial_Number 
{
   public static void main(String args[])
   {
	   Scanner input = new Scanner(System.in);
	   int no;
	   System.out.print("Enter the no to find factorial : ");
	   no = input.nextInt();
	   int fact = 1;
	   for(int i=1;i<=no;i++)
	   {
		   fact = fact * i;
	   }
	   System.out.printf("Factoria of %d  = %d",no,fact);
   }
}
