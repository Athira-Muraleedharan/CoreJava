
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1001,"Renu",1001);
		double bonus=e1.calculateBonus();
		System.out.println(bonus);
		Employee e2=new Employee();
		bonus=e2.calculateBonus();
		System.out.println(bonus);
		
		System.out.println(Employee.getComapanyName());
		 Employee e3=new Employee();
		 System.out.println(e3.getComapanyName());
		 }

}
