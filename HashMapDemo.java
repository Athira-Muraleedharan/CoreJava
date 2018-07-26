import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		//keys and values are objects
		hm.put("2", "Guru");
		hm.put("1", "Jack");
		hm.put("3", "Peter");
		//Print 
		System.out.println(hm);//Ordering is based on the hashcode value of the key
		System.out.println(hm.get("2"));
		
		Set keys =hm.keySet();//returns a set of keys
		Iterator it = keys.iterator();
		while( it.hasNext())
		{
			String key=(String)it.next();//key individually
			System.out.println(hm.get(key));//read the value by giving the key
		}
	}

}
