package objectorientedprogramming;
import java.util.Scanner;
public class Basic_Of_OOP_Tuto1 
{
   public static void main(String args[])
   {
	   Student student1 = new Student(); // Here student1 is an object or instance of the class Studnent which is in the same package
	   student1.age=12;
	   System.out.print(student1.age);
	   Test_purpose test1 = new Test_purpose();
	   test1.a =5;
	   System.out.print(test1.a);
	   test1.c=10;
	   System.out.print(test1.c);  
   }
}

