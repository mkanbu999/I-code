package problem;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//
//        String prefix = strs[0];
//
//        for (int i = 1; i < strs.length; i++) {
//            while (!strs[i].startsWith(prefix)) {
//                prefix = prefix.substring(0, prefix.length() - 1); // shorten the prefix
//                if (prefix.isEmpty()) return "";
//            }
//        }
//
//        return prefix;

            Arrays.sort(strs);  // sorts the array lexicographically
            int i = 0;
            String prefix = "";

            // Compare first and last strings after sorting
            while (i < strs[0].length() && i < strs[strs.length - 1].length()) {
                if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                    prefix += strs[0].charAt(i);
                    i++;
                } else {
                    break;
                }
            }

            System.out.println("Longest Common Prefix: " + prefix);  // Output: "fl"

       return prefix;
    }

    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        String[] words2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(words1)); // "fl"
        System.out.println(longestCommonPrefix(words2)); // ""
    }


}
