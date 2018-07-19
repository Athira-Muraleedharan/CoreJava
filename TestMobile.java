
public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile();
		m1.brandName="Samsung";
		m1.price=50999.00;
		m1.resolution=10;
		m1.color="rose gold";
		m1.makeACall();
		double discount=m1.getDiscount();
		System.out.println("discount:"+discount);
		
		Mobile m2=new Mobile();
		m2.brandName="Moto G";
		m2.price=50999.00;
		m2.resolution=10;
		m2.color="rose gold";
		m2.makeACall();
		discount=m2.getDiscount();
		System.out.println("discount:"+discount);
	}

}
