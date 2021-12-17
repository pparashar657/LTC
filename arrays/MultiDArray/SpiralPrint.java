package arrays.MultiDArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {

	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int lc = 0, rc = matrix[0].length-1, tr = 0, br = matrix.length-1;
        
        int total = matrix.length * matrix[0].length;
        
        int curr = 0;
        
        while(curr < total) {
            for (int col = lc ; curr < total && col <= rc ; col++) {
                ans.add(matrix[tr][col]);
                curr++;
            }
            tr++;
            
            for (int row = tr ; curr < total && row <= br ; row++) {
                ans.add(matrix[row][rc]);
                curr++;
            }
            rc--;
            
            for (int col = rc ; curr < total && col >= lc ; col--) {
                ans.add(matrix[br][col]);
                curr++;
            }
            br--;
            
            for (int row = br ; curr < total && row >= tr ; row--) {
                ans.add(matrix[row][lc]);
                curr++;
            }
            lc++;
        }
        
        return ans;
    }
}
