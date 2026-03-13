package test.java.LineCoverageTest;



import main.java.RomanNumeral;
import main.java.RomanNumeralCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo5 {


    @Test
    void testL1_belowRange() {
        assertThrows(IllegalArgumentException.class, () ->
                RomanNumeral.toRoman(0)
        );
    }


    @Test
    void testL1_aboveRange() {
        assertThrows(IllegalArgumentException.class, () ->
                RomanNumeral.toRoman(4000)
        );
    }

    // Couvre L2, L3, L4, L5(false pour tous sauf I), L6, L7, L8
    @Test
    void testL5_L6_L7_one() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    // Couvre L5, L6, L7 avec while execute plusieurs fois (MMM)
    @Test
    void testL5_L6_L7_whileMultipleTimes() {
        assertEquals("MMM", RomanNumeral.toRoman(3000));
    }

    // Couvre plusieurs symboles combines
    @Test
    void testL4_L5_multipleCombinations() {
        assertEquals("XIV", RomanNumeral.toRoman(14));
    }

    // Couvre symboles soustractifs (CM XC IX)
    @Test
    void testSubtractiveSymbols() {
        assertEquals("MCMXCIX", RomanNumeral.toRoman(1999));
    }

    // Couvre valeur maximale
    @Test
    void testL8_maxValue() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}
