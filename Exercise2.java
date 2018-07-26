//program to accept the name and city from the user, print the following output: Welcome Harish 
//																				 You are living in NY
import java.io.*;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the name of the user:");
		String name=br.readLine();
		System.out.println("Enter the city of the user:");
		String city=br.readLine();
		
		System.out.println("Welcome "+ name);
		System.out.println("You are living in "+city);

	}

}
