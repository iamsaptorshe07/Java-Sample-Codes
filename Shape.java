package java_exam_practice;
public class Shape 
{
   private int lenth,breadth;
   public void peremeter(int a,int b)
   {
	   this.lenth = a;
	   this.breadth = b;
	   int res;
	   res = 2*(lenth+breadth);
	   System.out.printf("Peremeter is %d",res);
   }
}
