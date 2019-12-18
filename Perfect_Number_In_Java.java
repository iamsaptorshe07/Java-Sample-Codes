package practice;
import java.util.Scanner;
public class Perfect_Number_In_Java 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);  // 6 = 1,2,3----1+2+3=6
	  System.out.print("Enter the no : ");
	  int no = input.nextInt();
	  int sum = 0;
	  for(int i=1;i<no;i++)
	  {
		  if(no%i==0)
		  {
			  sum = sum + i;
		  }
	  }
	 System.out.println("Sum of it's factors : "+ sum);
	 if(sum == no)
	 {   
		  
		 System.out.print("Perfect No");
	 }
	 else 
	 {
		 System.out.print("Not a Perfect no");
	 }
   }
}
