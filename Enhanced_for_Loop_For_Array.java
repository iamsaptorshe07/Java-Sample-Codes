// It is used to fetch all the values from the array
package practice;
import java.util.Scanner;
public class Enhanced_for_Loop_For_Array {
	public static void main(String args[])
	{
	 Scanner input = new Scanner(System.in);
	  int size;
	  System.out.print("Enter the size of the array : ");
	  size = input.nextInt();
	  int arr[] = new int[size];
	  int val;
	  for(int i=0;i<size;i++)
	  {
		  System.out.printf("Enter the %d no : ",i+1);
		  val = input.nextInt();
		  arr[i] = val;
	  }
	 for(int i : arr)  // This the example of enhanced for loop here we don't need to use index value
	 {
		System.out.printf("%d \t",i); // It is simmilar as for i in ---> Python example
	 }
		 
	}
}
