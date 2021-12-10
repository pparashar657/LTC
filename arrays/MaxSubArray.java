package arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = ArrayDemo.takeArrayInput();
		
		int ans = maxSubArray(arr);
		System.out.println(ans);
	}

	//  Kadane's Algorithm
	private static int maxSubArray(int[] arr) {
		int maximum =arr[0];
		int curr = 0;
		
		for(int i =0; i<arr.length; i++) {
			curr += arr[i];
			if(curr > maximum) {
				maximum = curr;		
			} 
            if(curr<=0) {
				curr = 0;
			}
		}
		  return maximum;
	}

}
