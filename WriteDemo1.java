import java.io.*;
public class WriteDemo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("d:\\athira\\test\\sample.txt");
		
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeBytes("Another Line \n");
		dos.writeBytes("Welcome to Deloitte\n");
		
		byte a[]= {'w','e','l','c','o','m','e'};
		
		fos.write(a);
		fos.write(' ');
		fos.write('h');
		fos.write('e');
		fos.write('l');
		fos.write('l');
		fos.write('o');
		
		fos.close();
		System.out.println("File Created successfully and go and check now");

	}

}
