//program to accept 5 integers from the user and find out the average
import java.io.*;
public class Exercise3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int sum=0;
		System.out.println("Enter 5 Integers:");
		for(int i=0;i<5;i++) {
			sum=sum+(Integer.parseInt(br.readLine()));
		}
		double average=sum/5.0;
		
		System.out.println("Sum of numbers:"+sum);
		System.out.println("Average of numbers:"+average);
		

	}

}
