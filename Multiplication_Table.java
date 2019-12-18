package java_exam_practice;
import java.util.Scanner;
public class Multiplication_Table 
{
	public static void main(String args[])
	{
	  Scanner input = new Scanner(System.in);
	  int no;
	  System.out.print("Enter the no for which you want to create the multiplication table : ");
	  no = input.nextInt();
	  for(int i=1;i<=10;i++)
	  {
		  System.out.printf("%d x %d = %d\n", no,i,no*i);
	  }
	}

}
