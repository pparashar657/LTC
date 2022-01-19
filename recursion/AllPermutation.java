package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllPermutation {

    public static void main(String[] args) {
        String str = "abc";

//        List<String> ans = getAllPermutation(str);
//        System.out.println(ans);

        printAllPermutation(str, "");
    }

    private static List<String> getAllPermutation(String str) {

        if(str.length() == 0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        List<String> smallAns = getAllPermutation(str.substring(1));

        List<String> finalAns = new ArrayList<>();

        for(String tmp: smallAns) {
            for(int i=0;i<=tmp.length();i++) {
                finalAns.add(tmp.substring(0,i) + str.charAt(0) + tmp.substring(i));
            }
        }
        return finalAns;
    }

    private static void printAllPermutation(String str, String ans) {

        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<=ans.length();i++) {
            String newAns = ans.substring(0,i) + str.charAt(0) + ans.substring(i);
            printAllPermutation(str.substring(1), newAns);
        }
    }

}
