package java_exam_practice;
import java.util.Scanner;
public class Buzz_no 
{ 
  public static void main(String args[])
  {
	  int no;
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter your number : ");
	  no = input.nextInt();
	  if(no%7==0 || no%1000==7)
	  {
		  System.out.print("Buzz No");
	  }
	  else
	  {
		  System.out.print("Not a Buzz no");
	  }
  }
}
