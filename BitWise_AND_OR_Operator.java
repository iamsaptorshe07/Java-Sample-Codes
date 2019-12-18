/*
  ---------------------------------Bitwise AND & OR operator------------------------------------
   AND = &
   OR = |
  -------------------------------------------------------------------------------------------------
 */
package practice;
public class BitWise_AND_OR_Operator 
{
  public static void main(String args[])
  {
     // Using loop for creating a Truth Table of AND GATE
	  System.out.println("------AND GATE------");
	  System.out.printf("A\tB\tC\n");
	  for(int i=0;i<=1;i++)
	  {
		  for(int j=0;j<=1;j++)
		  {
			  int res = i & j;
			  
			  System.out.printf("%d\t%d\t%d\n",i,j,res);
		  }
	  }
	  System.out.println("-----------------------\n");
	   // Using loop for creating a Truth Table of AND GATE
		  System.out.println("------OR GATE------");
		  System.out.printf("A\tB\tC\n");
		  for(int i=0;i<=1;i++)
		  {
			  for(int j=0;j<=1;j++)
			  {
				  int res = i | j;
				  
				  System.out.printf("%d\t%d\t%d\n",i,j,res);
			  }
		  }
		  System.out.println("-----------------------\n");
  }
}
