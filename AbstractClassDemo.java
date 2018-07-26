abstract class Person{
	public abstract void whatDoYouDo();
	public boolean doYouSpeak() {
		System.out.println("Speak");
		return true;
	}
}
class Trainer extends Person{

	@Override
	public void whatDoYouDo() {
		System.out.println("Delivers Lecturers");
		
	}
	
}
class Doctor extends Person{

	@Override
	public void whatDoYouDo() {
		System.out.println("Cures ill");
		
	}
	
}
class Pilot extends Person{

	@Override
	public void whatDoYouDo() {
		System.out.println("Flies the airplane");
		
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t=new Trainer();
		Doctor d=new Doctor();
		Pilot p=new Pilot();
		
		System.out.println("Doctor speak:"+d.doYouSpeak());
		System.out.println("Trainer speak:"+t.doYouSpeak());
		System.out.println("Pilot "
				+ ""
				+ "speak:"+p.doYouSpeak());
		d.whatDoYouDo();
		t.whatDoYouDo();
		p.whatDoYouDo();
	}

}
