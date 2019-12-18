package objectorientedprogramming;

public class Count_No_Of_Objects {

	public static void main(String args[])
	{
		Concept_Of_Constructor samp1 = new Concept_Of_Constructor(100,500);
		System.out.print(samp1.getRes());
		samp1.count();
		Concept_Of_Constructor samp2 = new Concept_Of_Constructor(4,5);
		samp1.count();
	}

}
