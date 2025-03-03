package leetcode;

public class RemoveElement {
	
	//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
	
	public static int removeElement(int[] nums, int val) {
		
		int k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
		
	}

	public static void main(String[] args) {
		
		int nums[] = {0,1,2,2,3,0,4,2}, val = 2;
		int totalElement=removeElement( nums, val);
		System.out.println(totalElement);
		/*for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}*/
				


	}

}
