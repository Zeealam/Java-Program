package Program;

public class Evennoinarray {

	// Program to print the elements of an array present on even position

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}

	}
}
