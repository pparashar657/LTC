package strings;

public class IntegerToRoman {

	public static void main(String[] args) {
		
		System.out.println(intToRoman(14));
		
	}
	
	static char getRoman(int num) {
		switch(num) {
		case 1: return 'I';
		case 5: return 'V';
		case 10: return 'X';
		case 50: return 'L';
		case 100: return 'C';
		case 500: return 'D';
		case 1000: return 'M';
		default: return ' '; 
		}
	}
	
	static boolean checkFirstDigit(int num) {
		int temp = num;
		int count = 0;
		while(temp > 9) {
			temp = temp/10;
			count ++;
		}
		
		if(temp == 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String intToRoman(int num) {
        
		int arr[] = {1,5,10,50,100,500,1000};
		String ans = "";
		for(int i=arr.length -1 ; i> -1; i--) {
			int quot = num /arr[i];
			int rem = num % arr[i];
			
			if(quot == 4) {
				ans += (getRoman(arr[i]) + "" +getRoman(arr[i+1]));
				num = rem;
			} else if(quot == 1 && (checkFirstDigit(rem))) {
				ans += (getRoman(arr[i-1]) + "" +getRoman(arr[i+1]));
				num = num % arr[i-1];
			} else {
				while(quot-- > 0) {
					ans += getRoman(arr[i]);
				}
				num = rem;
			}
		}
		return ans;
    }

}
