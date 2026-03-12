package test.java.BrancheCoverageTest;


import main.java.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo2 {


    @Test
    void testB1_s1Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram(null, "niche")
        );
    }


    @Test
    void testB1_s2Null() {
        assertThrows(NullPointerException.class, () ->
                Anagram.isAnagram("chien", null)
        );
    }


    @Test
    void testB3_differentLengths() {
        assertFalse(Anagram.isAnagram("chat", "chien"));
    }


    @Test
    void testB5_notAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "abce"));
    }


    @Test
    void testB6_isAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }
}
