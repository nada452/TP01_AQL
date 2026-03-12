package BrancheCoverageTest;

import main.java.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1 {

    // ✅ Couvre B1 : (s == null) → TRUE
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

    // ✅ Couvre B2 : (null) → FALSE
    //    Couvre B3 : while (i < j) → TRUE  (i=0, j=1 pour "ab")
    //    Couvre B5 : (charAt != charAt) → TRUE → return false
    @Test
    void testNotPalindromeEntersBranchFalse() {
        assertFalse(Palindrome.isPalindrome("ab"));
    }

    // ✅ Couvre B3 : while (i < j) → TRUE
    //    Couvre B6 : (charAt != charAt) → FALSE → continue
    //    Après la boucle → return true
    @Test
    void testPalindromeEntersBranchTrue() {
        assertTrue(Palindrome.isPalindrome("aba"));
    }

    // ✅ Renforce B3 + B6 sur plusieurs tours de boucle
    @Test
    void testLongerPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    // ✅ Renforce B5 sur une chaîne plus longue
    @Test
    void testLongerNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour"));
    }
}
