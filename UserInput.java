package practice;
import java.util.Scanner;
public class UserInput 
{
	 public static void main(String args[])
	    {
	        Scanner input = new Scanner(System.in);
	        int integer_val;
	        System.out.print("Enter any integer value : ");
	        integer_val = input.nextInt();
	        float float_val;
	        System.out.print("Enter any float value : ");
	        float_val = input.nextFloat();
	        double double_val;
	        System.out.print("Enter any double value : ");
	        double_val = input.nextDouble();
	        String string_val1;
	        System.out.print("Enter any String value without any space : ");
	        string_val1 = input.next(); // Ommit the charcters after any space
	        String string_val2;
	        System.out.print("Enter any String value including space : ");
	        string_val2 = input.nextLine(); // will not ommit the characters after space
	        System.out.printf("Integer value = %d \n",integer_val);
	        System.out.printf("Float Value = %f \n",float_val);
	        System.out.printf("Double value %f \n",double_val);
	        System.out.printf("String value %s \n",string_val1);
	        System.out.printf("String value = %s",string_val2);
	    }
}
