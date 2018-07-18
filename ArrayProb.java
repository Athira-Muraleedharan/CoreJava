//Program to check whether a given number is present in the array or not.
public class ArrayProb{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {30,50,26,70,12};
		// to print
		System.out.println("TO PRINT ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// to print in reverse order
		System.out.println("TO PRINT in reverse  ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		// to find out if 26 is present or not
		System.out.println(" present or not ");
		int found=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==26) {
				found=1;
				break;
			}
		}		
		if(found==1)
			System.out.println(" 26 is Present");
		else 
			System.out.println("26 not Present");

	}

}

