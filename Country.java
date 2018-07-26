
public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country[]= {"India","Pakistan","Japan"};
		String capital[]= {"New Delhi","Kabul","Beijing"};
		
		String name="India";
		for(int i=0;i<country.length;i++) {
			if(country[i].equals(name))
				System.out.println(country[i]+capital[i]);
			
			
		}
		

	}

}
