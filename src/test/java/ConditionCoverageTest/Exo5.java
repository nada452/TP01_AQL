package test.java.ConditionCoverageTest;



import main.java.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo5 {


    @Test
    void testC1_true_nLessThan1() {
        assertThrows(IllegalArgumentException.class, () ->
                RomanNumeral.toRoman(0)
        );
    }


    @Test
    void testC1_false_nValid() {
        assertDoesNotThrow(() ->
                RomanNumeral.toRoman(1)
        );
    }

   @Test
    void testC2_true_nGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () ->
                RomanNumeral.toRoman(5000)
        );
    }

     @Test
    void testC2_false_nValid() {
        assertDoesNotThrow(() ->
                RomanNumeral.toRoman(3999)
        );
    }

      @Test
    void testC3_true_whileEntered() {
        assertEquals("M", RomanNumeral.toRoman(1000));
    }

    @Test
    void testC3_false_whileSkipped() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }
 @Test
    void testC3_true_then_false_mixed() {
        assertEquals("MMXXVI", RomanNumeral.toRoman(2026));
    }

    @Test
    void testC3_true_subtractiveSymbols() {
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999));
    }


    @Test
    void testMinValid() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }


    @Test
    void testMaxValid() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}