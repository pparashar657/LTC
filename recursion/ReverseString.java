package recursion;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Pawan";

        String ans = reverse(str);
        System.out.println(ans);
    }

    private static String reverse(String str) {

        if(str.length() == 0) {
            return "";
        }
        char currChar = str.charAt(0);
        String ans = reverse(str.substring(1)) + currChar;
        return ans;
    }

}
