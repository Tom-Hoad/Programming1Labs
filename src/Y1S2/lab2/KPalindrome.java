package Y1S2.lab2;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.PalindromeChecker;

public class KPalindrome implements PalindromeChecker {
    public boolean isKPalindrome(String s, int i) {
        boolean palindrome = isPalindrome(s);

        if (i == 0) {
            return palindrome;
        } else if (palindrome) {
            return true;
        } else {
            return breakStrings(s, i - 1, 0);
        }
    }

    // Checks if the string is a palindrome.
    public boolean isPalindrome(String s) {
        int midPoint = s.length() / 2;

        if (s.length() % 2 == 0) {
            return s.substring(0, midPoint).equals(reverseString(s.substring(midPoint)));
        } else {
            return  s.substring(0, midPoint).equals(reverseString(s.substring(midPoint + 1)));
        }
    }

    // Reverses a string.
    public String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

    // Returns the broken string.
    public boolean breakStrings(String s, int i, int count) {
        if (count != s.length()) {
            boolean brokenString = isKPalindrome((s.substring(0, count) + s.substring(count + 1)), i);

            if (brokenString) {
                return true;
            } else {
                return breakStrings(s, i, count + 1);
            }
        }
        return false;
    }
}
