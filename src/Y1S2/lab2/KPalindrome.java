package Y1S2.lab2;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.PalindromeChecker;

public class KPalindrome implements PalindromeChecker {
    public boolean isKPalindrome(String s, int i) {
        if (i == 1) {
            return isPalindrome(s);
        } else {
            return true;
        }
    }

    // Checks if the string is a palindrome.
    public boolean isPalindrome(String s) {
        int midPoint = s.length() / 2;

        if (s.length() % 2 == 0) {
            return s.substring(0, midPoint - 1).equals(s.substring(midPoint));
        } else {
            midPoint = (int) Math.floor(midPoint);
            return s.substring(0, midPoint - 1).equals(s.substring(midPoint + 1));
        }
    }

    // Breaks the string apart.
    public String breakString(String s, int index) {
        if (index > 0) {
            return (s.substring(0, index - 1) + s.substring(index + 1));
        } else {
            return (s.substring(0, 0) + s.substring(index + 1));
        }
    }
}
