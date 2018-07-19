
public class Mobile {
	String brandName;
	int resolution;
	String color;
	double price;
	
	public void makeACall() {
		System.out.println("Please wait...connecting the call");
	}
	public void receiveACall() {
		
	}
	public void sendATest() {
	
	}
	public void switchOn() {
	
	}
	public void switchOff() {
	
	}
	public double getDiscount() {
		double discount=0;
		if(this.brandName.equals("Samsung"))
			discount=this.price*0.1;
		else if(this.brandName.equals("Moto G"))
			discount=this.price*0.15;
		return discount;
	}
}
