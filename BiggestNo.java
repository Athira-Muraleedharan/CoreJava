
public class BiggestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=9;
		if(num1==0 && num2==0)
			System.out.println("Both cannot be zero");
		else {
		
			if(num1>num2)
				System.out.println(num1 + " is the biggest no.");
			else 
				if(num1<num2)
					System.out.println(num2+ " is the biggest no.");
				else 
					System.out.println("Both are equal");

		}
	}

}
