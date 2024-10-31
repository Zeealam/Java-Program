package Program;

public class PrintSumOfAllTheElement {
	
	//Java Program to print the sum of all the items of the array
	
	
	public static void main(String []args) {
		
		int arr[]= new int [] {1,2,3,4,5,6,7};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		System.out.println(sum);
	}

}
