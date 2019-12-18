package objectorientedprogramming;
class Testing
{
    private int n1;
    private int n2;
	protected int sum;
	public void doSum(int a,int b) {
		n1 = a;
		n2 = b;
		sum = a + b;
	}
	public int getSum() {
	    return sum;
	}
}
class Testing2 extends Testing
{
  private int bonus=5000;
  private int result;
  public int getresult()
  {
	  result = bonus + sum;
	  return result;
  }
}

public class TestingClass
{
  public static void main(String args[])
  {
	  Testing obj = new Testing();
	  Testing2 obj1 = new Testing2();
	  obj1.doSum(40,50);
	  System.out.println(obj1.getSum());
	  System.out.println(obj1.getresult());
	 
  }
   
   
}
