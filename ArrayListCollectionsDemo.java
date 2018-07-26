//program to implement methods in Collections class
import java.util.*;
public class ArrayListCollectionsDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList source=new ArrayList();
		source.add(3);
		source.add(6);
		source.add(1);
		source.add(7);
		source.add(2);
		source.add(5);
		
		ArrayList dest=new ArrayList();
		dest.add(4);
		dest.add(5);
		dest.add(6);
		dest.add(2);
		dest.add(5);
		
		Collections.copy(source, dest);
		System.out.println("Collections- copy");
		System.out.println(dest);
		
		
		
		System.out.println(source);
		Collections.sort(source);
		System.out.println("Collections- sort");
		System.out.println(source);
		
		int res=Collections.binarySearch(source,5);
		System.out.println("Collections- binarySearch (element:5)");
		System.out.println(res);
		
		Collections.rotate(source,2);
		System.out.println("Collections- rotate");
		System.out.println(source);
		
		int c=(int) Collections.min(source);
		System.out.println("Collections- min");
		System.out.println(c);
		
		c=(int) Collections.max(source);
		System.out.println("Collections- max");
		System.out.println(c);
		
		
		
	}

}
