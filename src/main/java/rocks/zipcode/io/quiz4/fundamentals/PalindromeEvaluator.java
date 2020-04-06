package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> list = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                if (isPalindrome(string.substring(i,j))){
                    list.add(string.substring(i,j));
                }
            }
        }
        return list.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
