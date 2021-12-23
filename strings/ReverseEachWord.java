package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "I am a good boy";
		
//		String ans = reverseWords(str);

//		System.out.println(ans);
		System.out.println(reverseWordsOld(str));
	}
	
	static String reverseWordsOld(String str) {
		str = str+" ";
		String ans = "";
		int wordStart = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				ans = ans + reverseString(str.substring(wordStart, i)) +" ";
				wordStart = i+1;
			}
		}
		return ans;
	}
	
	
	private static String reverseString(String str) {
		
		String ans = "";
		
		for(int i=0;i<str.length();i++) {
			ans = str.charAt(i) + ans;
		}
		return ans;
	}

	public static String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        System.out.println(Arrays.toString(words));
        
        List<String> revWords = new ArrayList<>();
         
        for(String word: words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            revWords.add(sb.toString());
        }
        
        System.out.println(revWords);
        
        return String.join(" ", revWords);
    }
	
	public static String reverseWords2(String s) {
        
        String[] words = s.split(" ");
        
        System.out.println(Arrays.toString(words));
        
        StringBuilder ans = new StringBuilder();
        for(String word: words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            ans.append(" ").append(sb);
        }
        
        return ans.toString().trim();
    }

}
