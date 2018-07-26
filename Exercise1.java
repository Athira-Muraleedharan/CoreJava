//Program to accept an integer from the keyboard/ user, print whether it is divisible by 3 or not 
import java.io.*;
public class Exercise1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter an integer");
		int value=Integer.parseInt(br.readLine());
		
		if(value%3==0)
			System.out.println("The number "+ value + " is divisible by 3");
		else
			System.out.println("The number "+ value + " is not divisible by 3");

	}

}
