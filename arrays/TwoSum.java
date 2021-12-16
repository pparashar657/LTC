package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {3,8,2,5,9,1,5,8,3,6,1,9,6};
		
		List<List<Integer>> ans = threeSum(arr);
		
		List<Integer> list = Arrays.asList(1,2,3);
		list.add(4);
		
		System.out.println(list);
		
//		for(List<Integer> list: ans) {
//			System.out.println(list);
//		}
		
	}
	
	public static List<List<Integer>> twoSum(int[] nums, int start, int target) {
        int end = nums.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        
        while(start<end) {
            int currSum = nums[start] + nums[end];
            
            if(currSum == target) {
            	List<Integer> temp = new ArrayList<>();
                temp.add(nums[start]);
                temp.add(nums[end]);
                ans.add(temp);
                while(start< nums.length - 1 && nums[start] == nums[start+1]) start++;
                while(end > 0 && nums[end] == nums[end-1]) end--;
                start++;
                end--;
            } else if (currSum < target) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
    
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++) {
        	
        	if(i > 0 && nums[i] == nums[i-1]) continue;
        	
            List<List<Integer>> smallAns = twoSum(nums, i+1, -1*nums[i]);
            
            for (List<Integer> temp: smallAns) {
            	temp.add(nums[i]);
                ans.add(temp);            	
            }
        }
        
        return ans;
    }

//	private static List<List<Integer>> getTwoSum(int[] arr, int target) {
//		
//		List<List<Integer>> ans = new ArrayList<>();
//		
//		for(int i=0;i<arr.length; i++) {
//			for(int j=i+1; j< arr.length; j++) {
//				if(arr[i] + arr[j] == target) {
//					ans.add(Arrays.asList(i, j));
//				}
//			}
//		}
//		return ans;
//		
//	}

}
