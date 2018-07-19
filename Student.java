
public class Student {
	String name,result;
	int m1,m2,m3,total;
	char grade;
	public void calGrade() {
		if(total>=90)
			grade='A';
		else if(total>=80 && total<=89)
			grade='B';
		else if(total>=70 && total<=79)
			grade='C';
		
	}
	public void getResult() {
		if(m1>=35 && m2>=35 && m3>=35) 
			result="pass";
	}
	public void show() {
		System.out.println("Total marks:" +(m1+m2+m3));
		System.out.println("Grade:"+ grade);
		System.out.println("Percentage:"+total/3);
		
	}
}

