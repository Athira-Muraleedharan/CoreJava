import java.io.*;
public class FileReadDemo2 {

	public static void main(String[] args) throws IOException {
		//Creating a input stream to this file
		//So that we can read the file content through this stream.
		FileReader fr=new FileReader("src/hello");
		BufferedReader br=new BufferedReader(fr);
				
		// Use readLine method to read line by line
		String line=br.readLine();
		int flag=0;
		while(line!=null) { //Checking EOF
			
			if(line.contains("Java")) {
				flag=1;
				break;
			}
			line=br.readLine();// 
		}
		if(flag==1)
			System.out.println("Success");
		else
			System.out.println("The word Java is not found");
				
		//close the file
		fr.close();

	}

}
