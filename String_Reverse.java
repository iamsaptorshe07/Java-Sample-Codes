package java_exam_practice;
import java.util.Scanner;
public class String_Reverse 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  String original,reverse="";
	  System.out.print("Enter your string");
	  original = input.nextLine();
	  for(int i=original.length()-1;i>=0;i--)
	  {
		  reverse = reverse + original.charAt(i);
	  }
	  System.out.printf("Original = %s \nReverse = %s",original,reverse);
	  if(original.equals(reverse))
	  {
		  System.out.print("\nPallindrome");
	  }
	  else {
		  System.out.print("\nNot");
	  }
  }
}
