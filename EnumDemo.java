
public class EnumDemo {
	enum weekday{sunday,monday,tuesday,wednesday,thursday,friday,saturday};
	public static void main(String[] args) {
		//weekday[] w=weekday.values();
		//for(weekday w1:w)
		//	System.out.println(w1);
		
		int k=5;
		Integer ii=new Integer(k);
		System.out.println("The highest integer value is:"+ii.MAX_VALUE);

		double dd=new Double(123.5);
		System.out.println("The highest double value is:"+ii.MAX_VALUE);
		int kk=378;
		System.out.println(Integer.toHexString(kk));
		
		System.out.println(Integer.toBinaryString(kk));
	}

}
