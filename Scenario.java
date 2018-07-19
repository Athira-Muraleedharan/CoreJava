
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basket1[]= {"red","yellow","orange","red","red","red","yellow","orange","red","red"};
		String basket2[]= {"red","yellow","orange","red","red","yellow","orange","red","orange","red"};
		int count=0;
		for(int i=0;i<basket1.length;i++) {
			if(basket1[i].equals("red"))
				count+=1;
		}
		for(int i=0;i<basket2.length;i++) {
			if(basket2[i].equals("red"))
				count+=1;
		}
		System.out.println("no.of red balls in both the baskets = "+count);
	}

}
