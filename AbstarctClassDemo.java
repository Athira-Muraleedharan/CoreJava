abstract class Person1{
	String name,loc;
	public boolean doesHeBreathe() {
		System.out.println("Every person breathe");
		return true;
	}
	public boolean doesHeSleep() {
		System.out.println("Every Person sleeps");
		return true;
	}
	public abstract boolean doesHeDriveCar();
}

abstract class Empl extends Person1{
	public abstract boolean doesHeDriveCar();
}

class driver extends Empl{

	@Override
	public boolean doesHeDriveCar() {
		System.out.println("Every driver drives car.");
		return true;
	}
	public void setAllDetails(String name,String loc) {
		this.name=name;
		this.loc=loc;
	}
	public void getAllDetails() {
		System.out.println("Name: "+ this.name);
		System.out.println("Location:"+this.loc);
	}
	
}
public class AbstarctClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver d= new driver();
		System.out.println("Driving?"+d.doesHeDriveCar());
		System.out.println("Breathing?"+d.doesHeBreathe());
		System.out.println("Sleeping?"+d.doesHeSleep());
		d.setAllDetails("Arun", "Cochin");
		d.getAllDetails();
	}

}
