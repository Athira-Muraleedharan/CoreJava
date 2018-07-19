public class Car {
 private String carName;
 private double mileage;
 private double price;
 private boolean luxuryType;
 
 public void setCarDetails(String carName,double mileage,double price,boolean luxuryType) {
	 this.carName=carName;
	 this.mileage=mileage;
	 this.price=price;
	 this.luxuryType=luxuryType;
 }
 public void printCarDetails() {
	 System.out.println("CarName:"+this.carName);
	 System.out.println("Mileage:"+this.mileage);
	 System.out.println("Price:"+this.price);
	 System.out.println("LuxuryType:"+this.luxuryType);
 }
 public double costliestCar() {
	 return this.price;
 }
 public boolean chooseMyCar(){
	 boolean found=false;
	 if(this.mileage>=10 &&  this.price<=23000)	 
		 found=true;
	 return found;
 }
}
