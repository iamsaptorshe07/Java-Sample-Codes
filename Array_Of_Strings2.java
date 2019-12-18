package practice;
import java.util.Scanner;
public class Array_Of_Strings2 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
	  Scanner string_input = new Scanner(System.in);
	  int size;
	  System.out.print("Enter the size : ");
	  size = input.nextInt();
	  String array[] = new String[size];
   for(int i=0;i<size;i++)
    {
	  System.out.printf("Enter %d value : ",i+1);
	  array[i]=string_input.nextLine();
	}
   for(int i=0;i<size;i++)
   {
	   System.out.printf("%s \t",array[i]);
   }
   
  }	  
}

