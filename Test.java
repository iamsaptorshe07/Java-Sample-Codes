package java_exam_practice;
import java.util.Scanner;
public class Test 
{
 public static void main(String args[])
 {   
	 Scanner input = new Scanner(System.in);
	 String name;
	 System.out.print("Enter your name : ");
	 name = input.nextLine();
	 System.out.printf("Your name is %s ",name);
	 input.close();
	 
 }
}
