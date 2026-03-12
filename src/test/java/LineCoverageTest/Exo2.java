package test.java.LineCoverageTest;


import main.java.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo2 {

    // Couvre L1 : s1 == null
    @Test
    void testS1Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram(null, "niche")
        );
    }


    @Test
    void testS2Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram("chien", null)
        );
    }

    // Couvre L2, L3, L4 : longueurs différentes → false
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("chat", "chien"));
    }

    // Couvre L2, L3, L4(false), L5, L6, L7, L8(c!=0 → false)
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "abce"));
    }

    // Couvre L2, L3, L4(false), L5, L6, L7, L8(c==0), L9
    @Test
    void testIsAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // Couvre L2, L3 avec espaces et casse
    @Test
    void testAnagramIgnoresCaseAndSpaces() {
        assertTrue(Anagram.isAnagram("Listen", "Silent"));
    }
}