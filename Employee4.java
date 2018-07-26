
public class Employee4 implements Comparison{
	String name;
	double salary;
	Employee4(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public void whichIsGreater(Object o1,Object o2) {
		Employee4 e1=(Employee4)o1;
		Employee4 e2=(Employee4)o2;
		if(e1.salary>e2.salary)
			System.out.println(e1.name+" is greater");
		else
			System.out.println(e2.name+ " is greater");
		
		
	}
	
}
