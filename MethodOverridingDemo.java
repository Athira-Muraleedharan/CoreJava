class Animal{
	public void speak() {
		System.out.println("No particular animal");
	}
}
class dog extends Animal{
	@Override
	public void speak() {
		System.out.println("bow bow");
	}
}
class cat extends Animal{
	@Override
	public void speak() {
		System.out.println("meows");
	}
}
class horse extends Animal{
	@Override
	public void speak() {
		System.out.println("neigh");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animalName="Dog";
		invokeAnimalSound(animalName);

	}

 public static void invokeAnimalSound(String animalName) {
	  Animal a=null;
	  if(animalName.equals("Cat"))
		  a=new cat();
	  else if(animalName.equals("Dog"))
		  a=new dog();
	  else if(animalName.equals("Horse"))
		  a=new horse();
	  sound(a);
 }

 public static void sound(Animal a) {
	 a.speak();
 }
}