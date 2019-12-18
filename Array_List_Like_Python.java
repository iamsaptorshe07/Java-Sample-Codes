/* 
   Array list is like Python. It is almost same as list in Python. It is expandable.
   It is also known as dynamic array.  
*/
package practice;
import java.util.ArrayList; // To use Array list we have to import it
import java.util.Scanner;
public class Array_List_Like_Python 
{
 public static void main(String args[])
 {   
	 Scanner input = new Scanner(System.in);
	 ArrayList<String> lst = new ArrayList<>();
	 int size;
	 System.out.print("Enter the size of the array : ");
	 size = input.nextInt();
	 input.nextLine();
	 for(int i=0;i<size;i++)
	 {
		 String val;
		 System.out.printf("Enter %d value : ",i+1);
		 val = input.nextLine();
		 lst.add(val);
	 }
	 System.out.println(lst);
	 lst.clear(); // Clearing the list
	 System.out.println(lst);
	 
	 // For more visit smartherd arraylist video
 }
}
