
public class IndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Sanjana";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(ch=='a')
				System.out.println(name.indexOf(ch,i));
		}
	}

}
