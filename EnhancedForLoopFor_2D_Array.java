package practice;
import java.util.Random;
public class EnhancedForLoopFor_2D_Array 
{
   public static void main(String args[])
   {
	   Random rand = new Random();
	   int arr[][] = new int[3][4];
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<4;j++)
		   {
			   arr[i][j] = rand.nextInt(50);
		   }
	   }
	   
	  // Using Enhanced for loop to fetch the values from an array
	   
	   for(int i[] : arr) // Watch Telusko video
	   {
		   for(int j : i)
		   {
			   System.out.printf("%d \t",j);
		   }
		 System.out.println();  
	   }
	
	   }
   }

