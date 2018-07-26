
public class FrequencyC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		//String str="I am doing C Program then C++";
		String str=args[0];
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)=='C' || str.charAt(i)=='c'
					)
				count++;
		}
		System.out.println("Frequency of C in the given String is:"+count);
		
		
		
		

	}

}
