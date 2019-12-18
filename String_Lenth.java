package java_exam_practice;
import java.util.Scanner;
public class String_Lenth 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String str;
		System.out.print("Enter any string : ");
		str = input.nextLine();
		int lenth = str.length();
		System.out.printf("Entered String = %s \nLenth of the string is %d\n",str,lenth);
		for(int i=0;i<lenth;i++)
		{
			System.out.println(str.charAt(i));
		}
	}

}
