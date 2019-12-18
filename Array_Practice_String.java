package java_exam_practice;
import java.util.Scanner;
public class Array_Practice_String 
{ 
	public static void main(String args[])
	{
		int size;
		Scanner input = new Scanner(System.in);
		Scanner string_input = new Scanner(System.in);
		System.out.print("Enter the size : ");
		size = input.nextInt();
		String arr[] = new String[size];
		for(int i=0;i<size;i++)
		  {
			  String val;
			  System.out.printf("Enter %d value : ",i+1);
			  val = string_input.nextLine();
			  arr[i] = val;
			  
		  }
		  
		 for(int i=0;i<arr.length;i++)
		 {
			System.out.printf("%s \t", arr[i]); 
		 }
	}

}
