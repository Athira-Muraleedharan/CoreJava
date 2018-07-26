import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		//Adding elements to the link list
		l1.add("Java");
		l1.add("C++");
		l1.add("php");
		l1.add("Python");
		l1.add("C#");
		
		//Reading all elements together
		//Printing the containers
		System.out.println(l1);       //[Java	,C++,php,Python,C#]
		//List out one by one
		//Method 1:Using Traditional for loop
		System.out.println(" Reading using traditional for loop");
		for(int i=0;i<l1.size();i++) {
			System.out.println("Reading"+l1.get(i));
		}
		//Method 2: You can create iterator
		Iterator it=l1.iterator();
		System.out.println(" Reading using Iterator");
		while(it.hasNext()) {// moving the pointer to the next elements
			System.out.println(it.next());
		}
		
		System.out.println(" From top to bottom");
		
		ListIterator lt=l1.listIterator();
		while(lt.hasNext())//from top to bottom
		{
			System.out.println(lt.next());
		}
		System.out.println(" From bottom to top");
		while(lt.hasPrevious())//from bottom to top
		{
			System.out.println(lt.previous());
		}
			//Reverse out one by one
		//Using the Traditional for loop
		
		
	}
		
		
}
