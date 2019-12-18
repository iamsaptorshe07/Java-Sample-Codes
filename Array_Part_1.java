package practice;
import java.util.Scanner;
public class Array_Part_1 
{
  public static void main(String args[])
  {  	  //Integer  Arrays in Java
	  Scanner input = new Scanner(System.in);
	  int size_of_array;
	  System.out.print("Enter the size of the integer array : ");
	  size_of_array = input.nextInt();
	  int int_arr[] = new int[size_of_array];
	  for(int i=0;i<size_of_array;i++)
	  {
		  System.out.printf("Enter %d value : ",i+1);
		  int_arr[i] = input.nextInt();
	  }
	  for(int i=0;i<size_of_array;i++)
	  {
		  System.out.printf("%d \t",int_arr[i]);
	  }
	  System.out.println();
	  // Float array in java
	  System.out.print("Enter the size of the Floating array : ");
	  size_of_array = input.nextInt();
	  float float_arr [] = new float[size_of_array];
	  for(int i=0;i<size_of_array;i++)
	  {
		  System.out.printf("Enter %d value : ",i+1);
		  float_arr[i] = input.nextFloat();
	  }
	  for(int i=0;i<size_of_array;i++)
	  {
		  System.out.printf("%f \t",float_arr[i]);
	  } 
	  System.out.println();
	 
	  /*System.out.print("Enter the size of the String array : ");
	  size_of_array = input.nextInt();
	  String string_arr [] = new String[size_of_array];
	  for(int i=0;i<size_of_array;i++)
	  {
		  System.out.printf("Enter %d value : ",i+1);
		  string_arr[i] = input.nextLine();
	  }
	  for(int i=0;i<size_of_array;i++)
	  {
		  System.out.printf("%f \t",string_arr[i]);
	  } */
  }
}
