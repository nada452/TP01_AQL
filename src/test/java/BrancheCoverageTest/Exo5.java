package test.java.BrancheCoverageTest;



import main.java.RomanNumeral;
import main.java.RomanNumeralCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo5 {

    @Test
    void testB1_true_nLessThan1() {
        assertThrows(IllegalArgumentException.class, () ->
                RomanNumeral.toRoman(0)
        );
    }


    @Test
    void testB1_true_nGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () ->
                RomanNumeral.toRoman(4000)
        );
    }


    @Test
    void testB2_false_validRange() {
        assertDoesNotThrow(() ->
                RomanNumeral.toRoman(1)
        );
    }




    @Test
    void testB3_true_whileEntered() {
        assertEquals("M", RomanNumeral.toRoman(1000));
    }


    @Test
    void testB3_true_whileMultipleTimes() {
        assertEquals("MMM", RomanNumeral.toRoman(3000));
    }


    @Test
    void testB4_false_whileSkipped() {
        assertEquals("V", RomanNumeral.toRoman(5));
    }

    @Test
    void testB3_B4_mixed() {
        assertEquals("XLII", RomanNumeral.toRoman(42));
    }


    @Test
    void testB3_allSubtractiveSymbols() {
        assertEquals("CDXLIV", RomanNumeral.toRoman(444));
    }
}
