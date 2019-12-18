package practice;
import java.util.Scanner;
public class Array  // Array should be of same data types
{
  public static void main(String args[])
  {
	  
	  Scanner input = new Scanner(System.in);
	  int size;
	  System.out.print("Enter the size of the array : ");
	  size = input.nextInt();
	  int arr[] = new int[size];
	  int val;
	  for(int i=0;i<=size-1;i++)
	  {
		  System.out.printf("Enter the %d no : ",i+1);
		  val = input.nextInt();
		  arr[i] = val;
	  }
	  
	  for(int i=0;i<=size-1;i++)
	  {
		System.out.printf("%d value = %d \t",i+1,arr[i]);
	  }
	  
	  
  }
}
