package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Two Sum - Find two number in an array that add to a given target using a
 * hashmap for effcient lookups and return the indicices of the two number such 
 * that they add up to target.
 * 
 */
//Time complicity O(n) linear equation

public class TwoSum {

	public static int[] findTwoSum(int nums[], int target) {

		HashMap<Integer, Integer> numMap= new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			int extra= target-nums[i];//9-4=5
			
			if(numMap.containsKey(extra)) {
				return new int[] {numMap.get(extra),i};
			}
			numMap.put(nums[i], i);//5:0, 2:1, 11:2, 
			
		}
		return null;

	}

	public static void main(String[] args) {

		int nums[] = { 5, 2, 11, 4 };
		int target = 9;

		int result []=findTwoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}

}
