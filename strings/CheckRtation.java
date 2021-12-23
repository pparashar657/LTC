package strings;

public class CheckRtation {

	public static void main(String[] args) {
		
		String str = "abcde";
		
		String goal = "cdeab";
		
		//System.out.println(rotateString(str, 1));
		
		System.out.println(checkRotation(str, goal));
	}
	
	static String rotateString(String str, int k) {
		k = k%str.length();
		return str.substring(k) + str.substring(0,k);
	}
	
	public static boolean checkRotation(String s, String goal) {
        for(int i=0;i<s.length();i++) {
        	if(rotateString(s, i).equals(goal)) {
        		return true;
        	}
        }
        return false;
     }

}
