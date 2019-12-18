package practice;
import java.util.Scanner;
public class Switch_Case 
{
 public static void main(String args[])
 {
	 Scanner input = new Scanner(System.in);
	 int choice;
	 int a,b;
	 System.out.print("Enter the value of a and b : ");
	 a = input.nextInt();
	 b = input.nextInt();
	 System.out.print("1 : SUM\n2:SUBSTRACTION\n3:MULTIPLICATION\n4:DIVISION");
	 System.out.print("\nWhich operation do u want to perform : ");
	 choice = input.nextInt();
	 int c;
	 
	 // In java switch case supports String also , except this it is exactly same as C programming
	 
	 switch(choice)
	 {  
	    case 1:
	    	c = a+b;
	    	System.out.printf("%d + %d = %d",a,b,c);
	    	break;
	    case 2:
	    	c = a-b;
	    	System.out.printf("%d - %d = %d",a,b,c);
	    	break;
	    case 3:
	    	c = a*b;
	    	System.out.printf("%d x %d = %d",a,b,c);
	    	break;
	    case 4:
	    	c = a/b;
	    	System.out.printf("%d / %d = %d",a,b,c);
	    	break;
	    default:
	    	System.out.printf("Wrong option selected");
	    	
	    	
	 }
 }
}
