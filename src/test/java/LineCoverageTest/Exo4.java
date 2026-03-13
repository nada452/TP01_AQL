package test.java.LineCoverageTest;


import main.java.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo4 {


    @Test
    void testL1_aEqualsZero() {
        assertThrows(IllegalArgumentException.class, () ->
                QuadraticEquation.solve(0, 1, 1)
        );
    }



    @Test
    void testL3_negativeDelta() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }


    @Test
    void testL4_zeroDelta() {
        double[] result = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(new double[]{-1.0}, result);
    }


    @Test
    void testL5_positiveDelta() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(2.0, result[0], 1e-9);
        assertEquals(1.0, result[1], 1e-9);
    }
}