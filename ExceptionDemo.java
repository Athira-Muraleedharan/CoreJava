
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("End");
		
		
		 
	}

}
