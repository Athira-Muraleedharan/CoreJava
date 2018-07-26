class Employee1{
	int e1=101;
	public void getemp() {
		System.out.println("Employee :"+e1);
	}
}
class hr extends Employee1{
	int e2=102;
	public void getemp() {
		System.out.println("Employee :"+e2);
	}
}
class technical extends Employee1{
	int e3=103;
	public void getemp() {
		System.out.println("Employee :"+e3);
	}
}
class recruiter extends hr{
	int e4=104;
	public void getemp() {
		System.out.println("Employee :"+e4);
	}
}
class financier extends hr{
	int e5=105;
	public void getemp() {
		System.out.println("Employee :"+e5);
	}	
}
class javapm extends technical{
	int e6=106;
	public void getemp() {
		System.out.println("Employee :"+e6);
	}
}
class mainframepm extends technical{
	int e7=107;
	public void getemp() {
		System.out.println("Employee :"+e7);
	}
}
public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UPCASTING
		technical t=new javapm();
		t.getemp();
		hr h=new recruiter();
		h.getemp();
		hr e=new hr();
		e.getemp();
		Employee1 e1=new hr();
		e1.getemp();
		Employee1 e2=new javapm();
		e2.getemp();
		//DOWNCASTING
		
		
		
		Employee1 t1=new technical();
		Employee1 p=(Employee1)t1;
		p.getemp();
		
		
	}

}
