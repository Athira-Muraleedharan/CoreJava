import java.util.ArrayList;

public class ArrayListUnion {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		al2.add(5);
		al2.add(2);
		al2.add(3);
		
		System.out.println("ArrayList 1: "+ al1);
		System.out.println("ArrayList 2: "+ al2);
		
		//Union of 2 arraylists
		
		al1.addAll(al2);
		System.out.println("Union of 2 ArrayLists:"+ al1);

	}

}
