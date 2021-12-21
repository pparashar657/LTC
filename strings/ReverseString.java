package strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "   pawan is  ok   a     good boy   ";
		
//		String revStr = reverse(str);
//		
//		System.out.println(revStr);
		
		System.out.println(countWordWithoutSplit(str));
		
	}
	
	static int countWords(String str) {
		return str.trim().split("\\s+").length;
	}
	
	static int countWordWithoutSplit(String str) {
		
		str = str.trim();
		
		int count = 0;
		
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1) != ' ' && str.charAt(i) == ' ') {
				count++;
			}
		}
		
		return count + 1;
		
	}

	private static String reverse(String str) {
		
		String ans = "";
		
//		for(int i=str.length()-1; i>-1; i--) {
//			ans = ans + str.charAt(i);
//		}
		
		for(int i=0;i<str.length();i++) {
			ans = str.charAt(i) + ans;
		}
		
		return ans;
		
	}

}
