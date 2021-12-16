package arrays;

public class MaxSum {

	public static void main(String[] args) {
		
		int[][] mat = {	
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		
		System.out.println(maxSum(mat));
		
	}

	private static int maxSum(int[][] mat) {
		
		// rows sum
		
		int max = Integer.MIN_VALUE;
		
		for(int[] row: mat) {
			int currSum = 0;
			for(int i=0;i<row.length;i++) {
				currSum += row[i];
			}
			max = Math.max(max, currSum);
		}
		
		for(int j = 0; j<mat.length;j++) {
			int currSum = 0;
			for(int i = 0; i<mat.length;i++) {
				currSum += mat[i][j];
			}
			max = Math.max(max, currSum);
		}
		
		return max;
		
	}

}
