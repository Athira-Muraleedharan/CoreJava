import java.util.ArrayList;

public class ArraylistIntersection {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		
		al1.add(0);
		al1.add(5);
		al1.add(5);
		al1.add(0);
		

		al2.add(0);
		al2.add(5);
		al2.add(0);
		
		System.out.println("ArrayList 1: "+ al1);
		System.out.println("ArrayList 2: "+ al2);
		
		
		//Intersection of arraylist1 and arraylist2 
		
		al1.retainAll(al2);
		
		System.out.println("Intersection of 2 ArrayList: " + al1);

	}

}
