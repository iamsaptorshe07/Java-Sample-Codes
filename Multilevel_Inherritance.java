package objectorientedprogramming;
class Testing1
{
	protected int no1,no2,add;

	public void setNo(int no1,int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
    public int getAdd()
    {
    	this.add = this.no1 + this.no2;
    	return add;
    }
}
class Testing22 extends Testing1
{  
   private int sub;
   public int getSub()
   {
	 this.sub = super.no1 - super.no2;
	 return sub;
   }
}
class Testing3 extends Testing22
{
	private int mal;
	public int getMal()
	{
		this.mal = super.no1 * super.no2;
		return mal;
	}
}

public class Multilevel_Inherritance 
{
 public static void main(String args[])
 {
	 Testing3 obj1 = new Testing3();
	 obj1.setNo(40, 20);
	 System.out.println(obj1.getAdd());
	 System.out.println(obj1.getSub());
	 System.out.println(obj1.getMal());
 }
}
