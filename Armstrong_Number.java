package practice;
import java.util.Scanner;
public class Armstrong_Number 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  int no;
	  System.out.print("Enter no : ");
	  no = input.nextInt();
	  int sum = 0;
	  int main = no;
	  while(no>0)
	  {
		  sum = sum + ((no%10)*(no%10)*(no%10));
		  no = no/10;
	  }
	 if(main==sum)
	 {
		
		 System.out.print("Armstrong");
	 }
	 else
	 {
		 System.out.print("Not Armstrong");
	 }
  }
}
