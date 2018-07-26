
 class Parent {
	public void m1() {
		System.out.println("Parent Method m1");
	}
	public void m2() {
		System.out.println("Parent Method m2");
	}
}
 class Child extends Parent {
	public void m1() {
		System.out.println(" Child Method m1");
	}
	public void m3() {
		System.out.println("Child Method m3");
	}
}
 class Inheritance{
	 public static void main(String args[]) {
		 Parent p=new Child();
		 p.m1();
		  
	 }
 }