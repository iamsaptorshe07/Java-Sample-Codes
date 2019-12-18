// Guess the number game in Java
package practice;
import java.util.Scanner;
import java.util.Random;
public class Random_In_Java 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  Random r = new Random();
	  int no = r.nextInt(20);
	  System.out.print("Your maximum chance of guessing is 10: \n");
	  System.out.println("No has been selected, Enter value between 1-20");
	  for(int i=1;i<=10;i++)
	  {
		  System.out.printf("Enter the value chance %d : ",i);
		  int val = input.nextInt();
		  if(val==no)
		  {
			  System.out.println("You have guessed the right no");
			  System.out.printf("Selected no : %d ------ Guessed no : %d\n",no,val);
			  System.out.printf("Your score is %d \n",10-i);
			  break;
		  }
		  else if(val>no)
		  {
			  System.out.println("You have entered greater no");
		  }
		  else {
			  System.out.println("You have entered less no");
		  }
		  
	  }
	  
  }
}
