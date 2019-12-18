package java_exam_practice;
import java.util.Scanner;
public class Celcius_Ferhenheit 
{
   private static void celcius_to_ferhenheit(double val)
	 {
	   double res;
	   res = val*1.8+32;
	   System.out.printf("Celcius = %f --------- Ferhenheit = %f",val,res);
	 }
   private static void ferhenheit_to_celcius(double val)
	 {
	   double res;
	   res = (val-32)/1.8; 
	   System.out.printf("Ferhenheit = %f --------- Celcius = %f",val,res);
	 }
 
   public static void main(String args[])
 {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter 1 : Celcius to Ferhenheit\n");
	 System.out.print("Enter 2 : Ferhenheit to celcius\n");
	 int choice;
	 System.out.print("Enter your choice : ");
	 choice = input.nextInt();
	 if(choice == 1)
	 {
		double cel;
		System.out.print("Enter the celcius value");
		cel = input.nextDouble();
		celcius_to_ferhenheit(cel);
	 }
	 else if(choice == 2)
	 {
		    double fer;
		    System.out.print("Enter the Ferhenheit value");
			fer = input.nextDouble();
			ferhenheit_to_celcius(fer);
	 }
	 else
	 {
		 System.out.print("Wrong choice");
	 }
	 
 }
}
