package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		System.out.println((int)'*');
		System.out.println(Integer.MAX_VALUE);
		
		int[] arr = ArrayDemo.takeArrayInput();
		
		System.out.println(removeDuplicates(arr));
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static int removeDuplicates(int[] nums) {
        
		for (int i=1; i< nums.length;i++) {
			if(nums[i] == nums[i-1]) {
				nums[i-1] = Integer.MAX_VALUE;
			}
		}
		
		int index = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != Integer.MAX_VALUE) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				index++;
			}
		}
		return index;
    }

}
