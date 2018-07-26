import java.io.*;
public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {
		//Creating a input stream to this file
		//So that we can read the file content through this stream.
		FileInputStream fis=new FileInputStream("src/hello");
		
		int xx=fis.read();
		//-1 means EOF (End of File)
		while(xx!=-1) { //Checking EOF
			System.out.print((char)xx);
			xx=fis.read(); // continue reading the subsequent characters
		}
		
		//close the file
		fis.close();
	}

}
