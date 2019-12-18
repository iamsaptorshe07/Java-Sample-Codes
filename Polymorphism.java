// What is Polyorphism ?
// Ans : Polymorphism is basically when a class which is already created for doing some particular task but it is used in real world for doing something else. 
package objectorientedprogramming;
class Test
{
	public Test()
	{
		System.out.println("This is default constructor");
	}
	public Test(int a, int b)
	{
       System.out.println("This is constructor overloading");		
	}
	public void show()
	{
		System.out.println("This is Polymorphism part");
	}
	// Method overloading
	public void show(int a,int b) // This is Polymorphism ------> also known as Method Overloading and Method Overriding
	{
		System.out.println("This is Polymorphism part2");
	}
}
class Test1 extends Test 
{   
	// This is method overriding
	public void show()
	{
		System.out.println("This is method overridding");
	}
}

public class Polymorphism 
{
 public static void main(String args[])
 {
	 Test obj1 = new Test(3,5);   
	 Test1 obj2 = new Test1();
	 obj2.show();
 }
}
