class Cot{
	public double price;
}
class Chair{
	public double price;
}
class DiningTable{
	public double price;
}
class Furniture{
	public double calculateDiscount(Cot c){
		System.out.println("Cot discount is:");
		return c.price*0.1;
	}
	public double calculateDiscount(Chair cc){
		System.out.println("Chair discount is:");
		return cc.price*0.1;
	}
	public double calculateDiscount(DiningTable dt){
		System.out.println("DiningTable discount is:");
		return dt.price*0.1;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cot c=new Cot();
		Chair cc=new Chair();
		DiningTable dt=new DiningTable();
		c.price=78.90;
		cc.price=2671;
		dt.price=132.2;
		double price=0.0;
		Furniture f=new Furniture();
		price=f.calculateDiscount(cc);
		System.out.println(price);
		price=f.calculateDiscount(c);
		System.out.println(price);
		price=f.calculateDiscount(dt);
		System.out.println(price);
		
	}

}
