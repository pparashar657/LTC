package strings;

public class AddStrings {

	public static void main(String[] args) {
		
//		char ch = '9';
//		int n = ch - '0';
//		
//		System.out.println(n);
		
		System.out.println(addStrings("999", "1"));
		
	}
	
	public static String addStrings(String num1, String num2) {
        
//		int intNum1 = Integer.parseInt(num1);
//		
//		int intNum2 = Integer.parseInt(num2);
//		
//		int intAns = intNum1 + intNum2;
//		
//		return String.valueOf(intAns);
		
		StringBuilder ans = new StringBuilder();
		
		int carry = 0;
		
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		
		while(i > -1 && j > -1) {
			int digit1 = num1.charAt(i--) - '0';
			int digit2 = num2.charAt(j--) - '0';
			
			int temp = digit1 + digit2 + carry;
			if(temp > 9) {
				carry = 1;
				temp -= 10;
			} else {
				carry = 0;
			}
			
			ans.insert(0, String.valueOf(temp));
		}
		
		while( i > -1) {
			int digit1 = num1.charAt(i--) - '0';
			int temp = digit1 + carry;
			if(temp > 9) {
				carry = 1;
				temp -= 10;
			} else {
				carry = 0;
			}
			
			ans.insert(0, String.valueOf(temp));
		}
		
		while( j > -1) {
			int digit2 = num2.charAt(j--) - '0';
			int temp = digit2 + carry;
			if(temp > 9) {
				carry = 1;
				temp -= 10;
			} else {
				carry = 0;
			}
			
			ans.insert(0, String.valueOf(temp));
		}
		
		if ( carry == 1) {
			ans.insert(0, "1");
		}
		
		return ans.toString();
		
    }

}
