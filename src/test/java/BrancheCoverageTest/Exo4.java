package test.java.BrancheCoverageTest;



import main.java.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo4 {


    @Test
    void testB1_true_aZero() {
        assertThrows(IllegalArgumentException.class, () ->
                QuadraticEquation.solve(0, 5, 3)
        );
    }


    @Test
    void testB1_false_B2_true_negativeDelta() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }


    @Test
    void testB2_false_B3_true_zeroDelta() {
        double[] result = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(new double[]{-1.0}, result);
    }


    @Test
    void testB2_false_B3_false_positiveDelta() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertEquals(2, result.length);
        assertEquals(2.0, result[0], 1e-9);
        assertEquals(1.0, result[1], 1e-9);
    }
}
