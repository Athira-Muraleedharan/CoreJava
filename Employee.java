
public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private static String companyName="Deloitte";
	
	public Employee(){
		this.empId=1000;
		this.empName="Jeena";
		this.empSalary=5000;
	}
	public static String getComapanyName() {
		return companyName;
	}
	
	public Employee(int eid,String ename,double esal) {
		// TODO Auto-generated constructor stub
		this.empId=eid;
		this.empName=ename;
		this.empSalary=esal;
	}
	
	public double calculateBonus() {
		double bonus=0.0;
		if(this.empSalary<=5000)
			bonus=this.empSalary*.2;
		else
			bonus=this.empSalary*.1;
		return bonus;
	}
}
