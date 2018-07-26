
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String comp="Deloitte 9 *";
		char ch[]=comp.toCharArray();
		for(int i=0;i<comp.length();i++)
		{
			char x=ch[i];
			if(Character.isDigit(x))
				System.out.println(x + " is a digit");
			else if(Character.isLetter(x))
				System.out.println(x + " is a letter");
			else if(Character.isWhitespace(x))
				System.out.println(x + " is a Whitespace");
			else
					System.out.println(x + " is a  special character");
		}

	}

}
