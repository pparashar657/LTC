package arrays;

public class SortColors {

	public static void main(String[] args) {
		
		
		
	}
	
	// In single Pass
	public void sortColors2(int[] arr) {
        
        int zeroIdx = 0;
        int twoIdx = arr.length - 1;
        
        for (int i=0;i<=twoIdx;) {
            if(i > zeroIdx && arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIdx];
                arr[zeroIdx] = temp;
                zeroIdx++;
            } else if(i < twoIdx && arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[twoIdx];
                arr[twoIdx] = temp;
                twoIdx--;
            } else {
                i++;
            }
        }
        
        
    }
	
	public void sortColors(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;
        
        for(int num: arr) {
            if(num == 0) zeroCount++;
            if(num == 1) oneCount++;
        }
      
        int index = 0;
        
        for(int i=0; i< zeroCount;i++) {
            arr[index++] = 0;
        }
        
        for(int i=0; i< oneCount;i++) {
            arr[index++] = 1;
        }
        
        for(; index< arr.length;index++) {
            arr[index] = 2;
        }
        
        
    }
}
