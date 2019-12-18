package java_exam_practice;
import java.util.Scanner;
public class Array_Practice_Integer 
{
  public static void main(String args[])
  {   
	  int size;
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the size : ");
	  size = input.nextInt();
	  int arr[] = new int[size];
	  for(int i=0;i<size;i++)
	  {
		  int val;
		  System.out.printf("Enter %d value : ",i+1);
		  val = input.nextInt();
		  arr[i] = val;
		  
	  }
	  
	 for(int i=0;i<arr.length;i++)
	 {
		System.out.printf("%d \t", arr[i]); 
	 }
  }
}
