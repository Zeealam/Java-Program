package leetcodeTwoPointerTech;

public class RemoveDuplicatesFromSortedarray {
	
	public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,3,4,5,6,6,7};
		int result=removeDuplicates(arr);
		System.out.println("Number of unique elements:"+result);
		System.out.print("Modified array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
