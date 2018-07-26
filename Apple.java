
public class Apple implements Comparison {
	String loc;
	double price;
	Apple(String loc,double price){
		this.loc=loc;
		this.price=price;
	}
	@Override
	public void whichIsGreater(Object o1,Object o2) {
		Apple a1=(Apple)o1;
		Apple a2=(Apple)o2;
		if(a1.price>a2.price)
			System.out.println(a1.loc+" is greater");
		else
			System.out.println(a2.loc+ " is greater");
		
		
	}
}
