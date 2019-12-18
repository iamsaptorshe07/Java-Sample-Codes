package practice;
import java.util.Scanner;
public class Array_Of_Strings 
{
  public static void main(String args[])
  {
	  Scanner input = new Scanner(System.in);
      
	  String arr[] = new String[3];
	  arr[0] = "Saptorshe Das";
	  arr[1] = "Shiba Das";
	  arr[2] = "Munna Das";
   for(int i=0;i<3;i++)
    {
	  System.out.printf("%d \t",arr[i]);
    }
  }
	  
}

