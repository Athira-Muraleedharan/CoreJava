
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String singers[]= {"Emmanual","Rohit"};
		String guitars[]={"Glen","Summit","Ankit"};
		Band b1=new Band("Coffee",singers,guitars,"Ankush","Madahav");
		b1.printBandDetails();
		
		String singer[]= {"Emmanual","Rohit","Daya","Vidya"};
		String guitar[]={"Glen","Summit"};
		Band b2=new Band("Coffee Masala",singer,guitar,"Ankush","Madahav");
		b2.printBandDetails();
		int b1_count,b2_count;
		b1_count=b1.countMembers();
		b2_count=b2.countMembers();
		if(b1_count>b2_count)
			System.out.println("Band b1 has"+(b1_count-b2_count)+" more members than b2");
		else
			System.out.println("Band b2 has"+(b2_count-b1_count)+" more members than b1");
	}

	
}
