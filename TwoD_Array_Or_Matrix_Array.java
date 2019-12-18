package practice;
import java.util.Scanner;
public class TwoD_Array_Or_Matrix_Array 
{
  public static void main(String args[])
  {
	  int row,col;
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the row  : ");
	  row = input.nextInt();
	  System.out.print("Enter the colum size :");
	  col = input.nextInt();
	  int arr[][] = new int[row][col];int val;
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  System.out.printf("Enter the value : ");
			  val = input.nextInt();
			  arr[i][j] = val;
		  }
	  }
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  {
			  System.out.printf("%d \t",arr[i][j]);
		  }
		 System.out.println(); 
	  }
	  
  }
}
