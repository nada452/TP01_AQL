package test.java.ConditionCoverageTest;



import main.java.Palindrome;
import main.java.PalindromeCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo1 {


    @Test
    void testC1_true_nullString() {
        assertThrows(NullPointerException.class, () ->
                Palindrome.isPalindrome(null)
        );
    }
    @Test
    void testC1_false_nullString() {
        assertDoesNotThrow( () ->
                Palindrome.isPalindrome(null)
        );
    }


    @Test
    void testC1_false_notNull() {
        assertDoesNotThrow(() ->
                Palindrome.isPalindrome("")
        );
    }

    @Test
    void testC2_false_emptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testC2_false_singleChar() {
        assertFalse(Palindrome.isPalindrome("a"));
    }

    // C2 = TRUE → boucle exécutée au moins une fois
    @Test
    void testC2_true_enterLoop() {
        assertTrue(Palindrome.isPalindrome("aa"));
    }

    // C2 = TRUE plusieurs tours, puis FALSE quand i rejoint j
    @Test
    void testC2_true_then_false_afterLoop() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }}

// ───────────────────────────────────────────
