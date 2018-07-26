//program to accept 5 integers from the user and to find out the max.
import java.io.*;
public class Exercise {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int max=0,num=0;
		System.out.println("Enter 5 Integers:");
		for(int i=0;i<5;i++) {
			num=Integer.parseInt(br.readLine());
			if(max<num)
				max=num;
					
		}
		System.out.println("Maximim number is :"+max);

	}

}
