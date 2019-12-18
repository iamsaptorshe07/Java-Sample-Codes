package practice;
import java.util.Scanner;
public class Pallindrome_Number 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  int check,no,rev,res=0;
	  System.out.print("Enter the no of 3 digit : ");
	  no = input.nextInt();
	  check = no;
	  while(no>0)
	  { rev = no%10; 
	    no = no/10;
	    res = res * 10 + rev;
	  }
   System.out.printf("Number = %d    Reverse No : %d\n",check,res);
      if(check==res)
      {
    	  System.out.print("Pallindrome Number");
      }
      else
      {
    	  System.out.print("Not Pallindrome");
      }
  }
}
