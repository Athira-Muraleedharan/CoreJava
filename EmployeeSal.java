
public class EmployeeSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary=15000,tax,allowance,net_salary;
		tax=salary*0.1;
		allowance=salary*0.15;
		net_salary=salary+allowance-tax;
		System.out.println("Net Salary of the Employee "+net_salary);

	}

}
