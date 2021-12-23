package strings;

public class InsertChar {

	public static void main(String[] args) {
		
		String str = "Pawan";
		String newString = "book";
		String ans = insert(str, 2, newString);
		System.out.println(ans);
	}

	private static String insert(String str, int idx, String newString) {
		String leftPart = str.substring(0, idx);
		String rightPart = str.substring(idx);
		
		String ans = leftPart + newString + rightPart;
		
		return ans;
	}

}
