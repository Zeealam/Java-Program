package leetcodeTwoPointerTech;

import java.util.Arrays;

public class TwoSum {
	// Using two pointer technique

	public static void main(String[] args) {
	
		int[] nums = {2,4,5,11};
        int target = 15;

        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Number is not present");
        }
    }
	
	public static int[] findTwoSum(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        // Sort the array first
        Arrays.sort(nums);

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == target) {
                return new int[]{start, end}; // Return the indices if a match is found
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return null; // Return null if no match is found
    }
	
	}


