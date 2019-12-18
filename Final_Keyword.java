/*
 *  Final keyword : It can be used with a class, method as well as with a variable. It is used to make the thing constant or
 *  immutable, means ones the value is assigned , one can not change the value. but if at the time of if no value is assigned we
 *  will be able to assign the value to that variable only for once, later we can not change the value. Using final keyword with 
 *  a method we can restrict someone to overload / overriding that particular method, and using final keyword with a class we
 *  can restrict someone to inherrit that particular class.
 *  
 */
package practice;
import java.util.Scanner;
public class Final_Keyword 
{
  public static void main(String args[])
  {
	  int i=5;
	  System.out.println(i);
	  i++;
	  System.out.println(i);
	  final int j=10;
	  System.out.println(j);
	 // System.out.println(j);
	  
	  
  }
}
