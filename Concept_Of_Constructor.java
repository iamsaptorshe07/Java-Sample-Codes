package objectorientedprogramming;

public class Concept_Of_Constructor 
{   
	static int i = 0;
	protected int len,bred;
	Concept_Of_Constructor()
	{
		len = 10;
		bred = 20;
		i++;
	}
	Concept_Of_Constructor(int a,int b)
	{
		len = a;
		bred = b;
		i++;
	}
	protected int getRes() 
	{
		return len*bred;
	}
	protected void count()
	{
		System.out.printf("\nNo of object till now created %d \n",i);
	}
   
}
