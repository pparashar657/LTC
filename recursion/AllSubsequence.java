package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequence {

    public static void main(String[] args) {

        String str = "abc";

//        List<String> ans = getAllSubSequence(str);
//        System.out.println(ans);

        printAllSubSequence(str, "");

    }

    private static List<String> getAllSubSequence(String str) {

        if(str.length() == 0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        List<String> smallAns = getAllSubSequence(str.substring(1));

        List<String> finalAns = new ArrayList<>();

        for(String tmp: smallAns) {
            finalAns.add(str.charAt(0) + tmp);
            finalAns.add(tmp);
        }

        return finalAns;

    }



    private static void printAllSubSequence(String str, String ans) {

        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        printAllSubSequence(str.substring(1), ans);
        printAllSubSequence(str.substring(1), ans + str.charAt(0));
    }

}
