package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                set.add(string.substring(i,j));
            }
        }
        return set.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> common = new HashSet<>(Arrays.asList(getAllSubstrings(string1)));
        Set<String> common2 = new HashSet<>(Arrays.asList(getAllSubstrings(string2)));
        common.removeIf(s -> !common2.contains(s));
        return common.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] common = getCommonSubstrings(string1, string2);
        String currentBig = "";
        int currentMax = -1;
        for (int i = 0; i < common.length; i++) {
            if (common[i].length() > currentMax){
                currentBig = common[i];
                currentMax = common[i].length();
            }
        }
        return currentBig;
    }
}
