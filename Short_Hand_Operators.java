/*
   ----------------------------------Short Hand Operators----------------------------------------
   $1-> Short hand operators are special type of operators which are used to incrementing 
        and decrementing values of variables.
        
   $1-> Difference between ++i and i++ ?
        in case of ++i it is incrementing the value of i at first and in case of i++ 
        it increments the value later. 
   ----------------------------------------------------------------------------------------------
*/
package practice;
public class Short_Hand_Operators
{
	public static void main(String args[])
	{
		int i=10;
		System.out.print(i+"\n");
		i += 2; // this is the example of short hand operator
    }
}