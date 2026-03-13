package test.java.ConditionCoverageTest;

import main.java.BinarySearch;
import main.java.BinarySearchCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo3 {


    @Test
    void testC1_true_nullArray() {
        assertThrows(NullPointerException.class, () ->
                BinarySearch.binarySearch(null, 5)
        );
    }


    @Test
    void testC1_false_notNull() {
        assertDoesNotThrow(() ->
                BinarySearch.binarySearch(new int[]{1, 3, 5}, 3)
        );
    }




    @Test
    void testC2_false_emptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }


    @Test
    void testC2_true_enterLoop() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }


    @Test
    void testC2_true_then_false() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 6));
    }

    @Test
    void testC3_true_foundAtMid() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }


    @Test
    void testC3_false_notAtMid() {
        assertEquals(4, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 9));
    }



    @Test
    void testC4_true_goRight() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }


    @Test
    void testC4_false_goLeft() {
        assertEquals(1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 3));
    }




    @Test
    void testFoundFirstTry() {
        assertEquals(1, BinarySearch.binarySearch(new int[]{1, 5, 9}, 5));
    }


    @Test
    void testFoundAfterGoingRight() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 9}, 9));
    }


    @Test
    void testFoundAfterGoingLeft() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 3, 9}, 1));
    }
}