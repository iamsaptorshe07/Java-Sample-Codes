package practice;
import java.util.Scanner;
public class Prime_Number 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  int no,val=0,i;
		System.out.print("Enter the no:");
		no = input.nextInt();
		if(no==1)
		{
			System.out.println("Not Prime");
		}
		else if(no==2)
		{
			System.out.printf("Prime");
		}
		else{
			for(i=2;i<no;i++)
			{
				if(no%i==0)
				{
					System.out.printf("Not Prime");
					val = 1;
					break;
				}	
			}
		if(val==0)
		{
			System.out.printf("Prime no");
		}
			
		} 
  }
}
