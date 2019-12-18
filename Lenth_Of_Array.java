package practice;
import java.util.Random;
public class Lenth_Of_Array
{
  public static void main(String args[]) 
  {
	Random r = new Random();
    int num[] = new int[20];
    for(int i=0;i<20;i++)
      {
	    num[i]=r.nextInt(50);
      }
    int lenth = num.length;
    System.out.printf("Lenth is %d",lenth);
  }
}
