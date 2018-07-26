import java.io.*;
public class WriteDemo3 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("d:\\athira\\test\\myinput.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String city;
		System.out.println("Enter the city :");
		city=br.readLine();
		
		while(!(city.equalsIgnoreCase("STOP")))
		{
			bw.write(city);
			System.out.println("Enter the city :");
			city=br.readLine();
			bw.newLine();
		}
		bw.close();
		fw.close();
		System.out.println("File successfully created");
	}

}
