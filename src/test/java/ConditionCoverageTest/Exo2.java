package test.java.ConditionCoverageTest;



import main.java.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests de COUVERTURE DES CONDITIONS pour AnagramCorrection.
 *
 * Conditions atomiques à couvrir (TRUE et FALSE) :
 *   C1 - s1 == null
 *   C2 - s2 == null
 *   C3 - s1.length() != s2.length()
 *   C4 - c != 0
 */
public class Exo2 {

    // ───────────────────────────────────────────
    // C1 : s1 == null
    // ───────────────────────────────────────────

    // C1 = TRUE
    @Test
    void testC1_true_s1Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram(null, "niche")
        );
    }

    // C1 = FALSE (s1 non null)
    @Test
    void testC1_false_s1NotNull() {
        assertDoesNotThrow(() ->
                Anagram.isAnagram("chien", "niche")
        );
    }

    // ───────────────────────────────────────────
    // C2 : s2 == null
    // ───────────────────────────────────────────

    // C1 = FALSE, C2 = TRUE
    @Test
    void testC2_true_s2Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram("chien", null)
        );
    }

    // C1 = FALSE, C2 = FALSE
    @Test
    void testC2_false_s2NotNull() {
        assertDoesNotThrow(() ->
                Anagram.isAnagram("chien", "niche")
        );
    }

    // ───────────────────────────────────────────
    // C3 : s1.length() != s2.length()
    // ───────────────────────────────────────────

    // C3 = TRUE : longueurs différentes → false
    @Test
    void testC3_true_differentLengths() {
        assertFalse(Anagram.isAnagram("chat", "chien"));
    }

    // C3 = FALSE : longueurs égales → continue
    @Test
    void testC3_false_sameLengths() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // ───────────────────────────────────────────
    // C4 : c != 0
    // ───────────────────────────────────────────

    // C4 = TRUE : un compteur non nul → pas anagramme → false
    @Test
    void testC4_true_notAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "abce"));
    }

    // C4 = FALSE : tous les compteurs à 0 → anagramme → true
    @Test
    void testC4_false_isAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // ───────────────────────────────────────────
    // Cas combinés
    // ───────────────────────────────────────────

    // C1=FALSE, C2=FALSE, C3=FALSE, C4=FALSE avec casse et espaces
    @Test
    void testAnagramCaseAndSpaces() {
        assertTrue(Anagram.isAnagram("Listen", "Silent"));
    }

    // C1=FALSE, C2=FALSE, C3=TRUE avec espaces
    @Test
    void testDifferentLengthsAfterNormalization() {
        assertFalse(Anagram.isAnagram("a b", "abc"));
    }
}
