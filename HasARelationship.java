/* 
 * Author:Athira Muraleedharan
 */
/*
 * Date:19 July 2018
 */
// Program depicting HAS-A Relationship.
  class employee3{

	int eid;
	String ename;
	String dept;
	double salary;
	address add;
	employee3(double salary,String ename,int eid,String dept,address add){
		this.salary=salary;
		this.ename=ename;
		this.dept=dept;
		this.eid=eid;
		this.add=add;
	}
	public void printEmployeeDetails() {
		System.out.println("Employee id:"+this.eid);
		System.out.println("Employee name:"+this.ename);
		System.out.println("Employee dept:"+this.dept);
		System.out.println("Employee salary:"+this.salary);
		add.printAddressDetails();
	}
	
}
 class address{
	 int flatNo;
	 String flatName;
	 String main;
	 String cross;
	 String city;
	 long pincode;
	 address(int flatNo,String flatName,String main,String cross,String city,long pincode){
		 this.flatNo=flatNo;
		 this.flatName=flatName;
		 this.main=main;
		 this.cross=cross;
		 this.city=city;
		 this.pincode=pincode;
	 }
	 public void printAddressDetails() {
			System.out.println("FlatName:"+this.flatName);
			System.out.println("FlatNo:"+this.flatNo);
			System.out.println("Main:"+this.main);
			System.out.println("Cross:"+this.cross);
			System.out.println("Pincode:"+this.pincode);
		}
 }

public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create dependent object first
		address a=new address(112,"Shanti Niketan","7th Main","8th Cross","Mumbai",560009);
		//Create the bigger object
		employee3 e=new employee3(12345.6,"Peter",123,"Finance",a);
		e.printEmployeeDetails();

	}

}
