package leetcode;

public class MergeSortArray {
//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

	public void merge(int[] num1, int m, int[] num2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int p = m + n - 1;
		while (p2 >= 0) {
			if (p1 >= 0 && num1[p1] > num2[p2]) {
				num1[p] = num1[p1];
				p1--;
			} else {
				num1[p] = num2[p2];
				p2--;
			}
			p--;
		}

	}

	public static void main(String[] args) {
		MergeSortArray mergesort = new MergeSortArray();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		mergesort.merge(nums1, m, nums2, n);
		// Print the merged array
		System.out.print("Merged array: ");
		for (int i = 0; i < m + n; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
	}

}
