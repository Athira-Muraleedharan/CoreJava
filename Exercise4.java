// Program: Keep asking the user to input the city names till she/he types "STOP" Print how many cities entered by the user.
import java.io.*;
public class Exercise4 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String city=" ";
		int count=0;
		while(!(city.equalsIgnoreCase("STOP")))
		{
			count++;
			System.out.println("Enter the city :");
			city=br.readLine();
		}
		System.out.println("No. of cities entered by the User:"+(count-1));

	}

}

// int cnt=0;
//sop("Enter a city")
// String city=br.readLine();
//while(!city.equalsIgnoreCase("STOP")
//{
//cnt++;
//SOP("Enter the city:")
//city=br.readLine();
//}
//sop(cnt)