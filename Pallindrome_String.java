package practice;
import java.util.Scanner;
public class Pallindrome_String
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  int ln;
	  String string,rev="";
	  System.out.print("Enter the string : ");
	  string = input.nextLine();
	  ln = string.length();
	  for(int i=ln-1;i>=0;i--)
		  {
             rev = rev + string.charAt(i);		  
		  }
	  System.out.printf("Entered String = %s   Reverse String = %s\n",string,rev);
	  if(string.equals(rev))
	  {
		  System.out.println("Pallindrome");
	  }
	  else {
		  System.out.println("Not pallindrome");
	  }
  }

}
