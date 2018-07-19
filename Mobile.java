
public class Mobile {
	String brandName;
	int resolution;
	String color;
	double price;
	
	public void makeACall() {
		System.out.println("Please wait...connecting the call");
	}
	public void receiveACall() {
		System.out.println("Receiving A Call");
	}
	public void sendAText() {
		System.out.println("Texting a message");
	}
	public void switchOn() {
		System.out.println("Switching On");
	}
	public void switchOff() {
		System.out.println("Switched Off");
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
