import java.io.*;
public class FileReadDemo2 {

	public static void main(String[] args) throws IOException {
		//Creating a input stream to this file
		//So that we can read the file content through this stream.
		FileReader fr=new FileReader("src/hello");
		BufferedReader br=new BufferedReader(fr);
				
		// Use readLine method to read line by line
		String line=br.readLine();
		
		while(line!=null) { //Checking EOF
					System.out.println(line);
					line=br.readLine();// 
				}
				
				//close the file
				fr.close();

	}

}
