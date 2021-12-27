package strings;

public class CompressString {

	public static void main(String[] args) {
		String input = "aabbbcdddddda";
		
		String ans = compress(input.toCharArray());
		
		System.out.println(ans);
	}

	private static String compress(char[] input) {
		
		StringBuilder ans = new StringBuilder();
		
		int count = 1;
		for(int i =1;i<input.length;i++) {
			if(input[i]==input[i-1]) {
				count++;
			}else {
				if(count > 1) {
					ans.append(input[i-1]+""+count);
				} else {
					ans.append(input[i-1]+"");
				}
				count = 1;
			}
		}
		if(count > 1) {
			ans.append(input[input.length-1]+""+count);
		} else {
			ans.append(input[input.length-1]+"");
		}
		
		for(int i=0;i<ans.length();i++) {
			input[i] = ans.charAt(i);
		}
		
		return ans;
	}

}
