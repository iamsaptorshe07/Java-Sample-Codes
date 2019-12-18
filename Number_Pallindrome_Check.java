package java_exam_practice;
import java.util.Scanner;
public class Number_Pallindrome_Check 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  int original,reverse;
	  System.out.print("Enter the number : ");
	  original = input.nextInt();
	  String str_or,str_rv="";
	  str_or = Integer.toString(original);
	  for(int i=str_or.length()-1;i>=0;i--)
	  {
		  str_rv = str_rv + str_or.charAt(i);
	  }
	  reverse = Integer.parseInt(str_rv);
	  System.out.printf("Entered number = %d\n",original);
	  System.out.printf("Reversed String = %d\n", reverse);
	  if(original==reverse)
	  {
		  System.out.print("Pallindrome");
	  }
	  else
	  {
		  System.out.print("Not Pallindrome");
	  }
  }
}
