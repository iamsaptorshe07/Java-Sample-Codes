package practice;
import java.util.Random;
public class Three_3D_Array 
{
  public static void main(String args[])
  {
	  Random rand = new Random();
	  int arr[][][] = new int[4][3][4];
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  for(int k=0;k<4;k++)
			  {
				  arr[i][j][k] = rand.nextInt(50);
			  }
		  }
	  }
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  for(int k=0;k<4;k++)
			  {
				  System.out.printf("%d \t",arr[i][j][k]);
			  }
			System.out.println();  
		  }
			System.out.println(); 
	  }
  }
}
