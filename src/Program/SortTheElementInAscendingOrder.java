package Program;

public class SortTheElementInAscendingOrder {

	// Java Program to sort the elements of an array in ascending order

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 6, 8, 9, 4, 3 };
		int temp =0;

		System.out.println("Orignal array value");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Sorted Element is");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
}
