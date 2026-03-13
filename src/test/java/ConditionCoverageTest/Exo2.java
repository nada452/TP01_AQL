package test.java.ConditionCoverageTest;



import main.java.Anagram;
import main.java.AnagramCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo2 {
    void testC1_true_s1Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram(null, "niche")
        );
    }

    @Test
    void testC1_false_s1NotNull() {
        assertDoesNotThrow(() ->
                Anagram.isAnagram("chien", "niche")
        );
    }

    @Test
    void testC2_true_s2Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram("chien", null)
        );
    }

     @Test
    void testC2_false_s2NotNull() {
        assertDoesNotThrow(() ->
                Anagram.isAnagram("chien", "niche")
        );
    }

    @Test
    void testC3_true_differentLengths() {
        assertFalse(Anagram.isAnagram("chat", "chien"));
    }

    @Test
    void testC3_false_sameLengths() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

     @Test
    void testC4_true_notAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "abce"));
    }

    @Test
    void testC4_false_isAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }
    @Test
    void testAnagramCaseAndSpaces() {
        assertTrue(Anagram.isAnagram("Listen", "Silent"));
    }

    @Test
    void testDifferentLengthsAfterNormalization() {
        assertFalse(Anagram.isAnagram("a b", "abc"));
    }
}
