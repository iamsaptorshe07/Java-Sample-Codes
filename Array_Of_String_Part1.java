package practice;
import java.util.Scanner;
public class Array_Of_String_Part1 
{
   public static void main(String args[])
   {
	   Scanner input = new Scanner(System.in);
	   int size;
	   System.out.print("Enter the size of the array : ");
	   size = input.nextInt();
	   String arr[] = new String[size];
	   for(int i=0;i<size;i++)
	   {
		   System.out.printf("Enter %d value : ",i);
		   String val;
		   val = input.nextLine();
		   arr[i]=val;
	   }
	   
	   /*
	   arr[0] = "Saptorshe Das";
	   arr[1] = "Shiba Das";
	   arr[2] = "Munna Das";
	   System.out.println(arr[0]);
	   System.out.println(arr[1]);
	   System.out.println(arr[2]);
	   */
	   for(int i=0;i<3;i++)
	   {
		   System.out.printf("%s \t", arr[i]);
	   }
   }
}
