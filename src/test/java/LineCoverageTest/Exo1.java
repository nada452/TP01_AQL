package test.java.LineCoverageTest;

import main.java.Palindrome;
import main.java.PalindromeCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1 {


    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () ->Palindrome.isPalindrome(null)
        );
    }
    @Test
    void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }
    @Test
    void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testSimplePalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }}
