package strings;

import java.util.Arrays;
import java.util.Scanner;

public class HighestFrequencyChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string : ");
		String str = sc.next();
		
		char ans = getMaxOccuringChar(str);
		
		System.out.println(ans);
	}
	
//	static String sortString(String str) {
//		
//		char[] chArr = str.toLowerCase().toCharArray();
//		
//		Arrays.sort(chArr);
//		
//		return String.valueOf(chArr);
//	}
//	
//	//Function to find the maximum occurring character in a string.
//    public static char getMaxOccuringChar(String line)
//    {
//        String sortedString = sortString(line);
//        
//        int max = 1;
//        char ans = sortedString.charAt(0);
//        int currFreq = 1;
//        for(int i=0;i<sortedString.length()-1;i++) {
//        	if(sortedString.charAt(i) == sortedString.charAt(i+1)) {
//        		currFreq++;
//        		if(currFreq > max) {
//        			ans = sortedString.charAt(i);
//        			max = currFreq;
//        		}
//        	} else {
//        		currFreq = 1;
//        	}
//        }
//        return ans;
//    }
    
    
    public static char getMaxOccuringChar(String line)
    {
    	int[] charMap = StringDemo.getCharMap(line);
    	
    	int max = 0;
    	char ans = ' ';
    	for(int i=0;i<charMap.length;i++) {
    		if(charMap[i] > max) {
    			max = charMap[i];
    			ans = (char) i;
    		}
    	}
    	return ans;
    }
	
	

}
