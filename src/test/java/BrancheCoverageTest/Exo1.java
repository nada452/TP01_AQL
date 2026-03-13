package BrancheCoverageTest;

import main.java.Palindrome;
import main.java.PalindromeCorrection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1 {


    @Test
    void testNullThrowsException() {
        assertThrows(NullPointerException.class, () ->
                Palindrome.isPalindrome(null)
        );
    }


    @Test
    void testEmptyStringIsNotNull() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testNotPalindromeEntersBranchFalse() {
        assertFalse(Palindrome.isPalindrome("ab"));
    }

     @Test
    void testPalindromeEntersBranchTrue() {
        assertTrue(Palindrome.isPalindrome("aba"));
    }

    @Test
    void testLongerPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void testLongerNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour"));
    }
}
