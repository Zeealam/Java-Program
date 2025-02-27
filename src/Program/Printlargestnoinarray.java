package Program;

public class Printlargestnoinarray {

	// Program to print the largest element in an array

	public static void main(String[] args) {

		int arr[] = new int[] { 11, 55, 99, 63, 100 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element in an array is:"+max);
	}

}
