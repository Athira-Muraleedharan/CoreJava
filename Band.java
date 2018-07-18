
public class Band {
	private String bandName;
	private String singers[];
	private String guitarists[];
	private String drummer;
	private String keyboardPlayer;
	
	public Band(String bandName, String[] singers2, String[] guitars, String drummer, String keyboard) {
		// TODO Auto-generated constructor stub
		this.bandName=bandName;
		this.singers=singers2;
		this.guitarists=guitars;
		this.drummer=drummer;
		this.keyboardPlayer=keyboard;
	}
	
	public void printBandDetails() {
		System.out.println("Band Name:"+this.bandName);
		System.out.println("Singers");
		for(int i=0;i<singers.length;i++) {
			System.out.println(singers[i]);
		}
		System.out.println("guitarists");
		for(int i=0;i<guitarists.length;i++) {
			System.out.println(guitarists[i]);
		}
		System.out.println("Drummer:"+this.drummer);
		System.out.println("KeyBoard Player:"+this.keyboardPlayer);
	}
		
		public int countMembers() {
			return 2+singers.length+guitarists.length;
		}
		
	
}