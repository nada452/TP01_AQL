package test.java.ConditionCoverageTest;



import main.java.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo4 {


    @Test
    void testC1_true_aZero() {
        assertThrows(IllegalArgumentException.class, () ->
                QuadraticEquation.solve(0, 1, 1)
        );
    }


    @Test
    void testC1_false_aNonZero() {
        assertDoesNotThrow(() ->
                QuadraticEquation.solve(1, 0, 1)
        );
    }


    @Test
    void testC2_true_deltaNegative() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }


    @Test
    void testC2_false_deltaNonNegative() {
        assertNotNull(QuadraticEquation.solve(1, 2, 1));
    }


    @Test
    void testC3_true_deltaZero() {
        double[] result = QuadraticEquation.solve(1, -2, 1);
        assertArrayEquals(new double[]{1.0}, result);
    }


    @Test
    void testC3_false_deltaPositive() {
        double[] result = QuadraticEquation.solve(1, -5, 6);
        assertEquals(2, result.length);
        assertEquals(3.0, result[0], 1e-9);
        assertEquals(2.0, result[1], 1e-9);
    }
}