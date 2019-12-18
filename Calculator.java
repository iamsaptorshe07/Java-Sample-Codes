package java_exam_practice;
import java.util.Scanner;
public class Calculator 
{
    private static void sum(int no1, int no2)
    {
    	int sum = no1 + no2;
    	System.out.printf("%d + %d = %d",no1,no2,sum);
    }
    private static void sub(int no1, int no2)
    {
    	int sub = no1 - no2;
    	System.out.printf("%d - %d = %d",no1,no2,sub);
    }
    private static void mul(int no1, int no2)
    {
    	int mul = no1 * no2;
    	System.out.printf("%d x %d = %d",no1,no2,mul);
    }
    private static void div(int no1, int no2)
    {
    	int div = no1 / no2;
    	System.out.printf("%d / %d = %d",no1,no2,div);
    }
    
	public static void main(String args[])
  {
	  int no1,no2;
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter your 1st no : ");
	  no1 = input.nextInt();
	  System.out.print("Enter your 2nd no : ");
	  no2 = input.nextInt();
	  int choice;
	  System.out.println("TO perform addition press 1 ");
	  System.out.println("TO perform substarction press 2 ");
	  System.out.println("TO perform multiplication press 3 ");
	  System.out.println("TO perform division press 4 ");
	  System.out.print("Now Enter your choice : ");
	  choice = input.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  sum(no1,no2);
		  break;
	  }
	  case 2:
	  {
		  sub(no1,no2);
		  break;
	  }
	  case 3:
	  {
		  mul(no1,no2);
		  break;
	  }
	  case 4:
	  {
		  div(no1,no2);
		  break;
	  }
	  default:
	  {
		  System.out.println("You have entered wrong key");
	  }
	  }
	  
	  
  }
  
}
