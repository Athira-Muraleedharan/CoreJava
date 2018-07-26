import java.io.*;
public class WriteFileDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("d:\\athira\\test\\sample.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("First Line");
		bw.newLine(); // will insert a blank
		
		bw.write("Second Line");
		bw.newLine(); // will insert a blank
		
		bw.write("Third Line");
		bw.newLine(); // will insert a blank
		
		bw.write("Fourth Line");
		bw.newLine(); // will insert a blank
		
		bw.close();//close this first
		fw.close();// close this next
		
		System.out.println("Successfully created");

	}

}
