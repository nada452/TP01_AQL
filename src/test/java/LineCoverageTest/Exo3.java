package test.java.LineCoverageTest;



import main.java.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo3 {

    // Couvre L1 : array == null → exception
    @Test
    void testL1_nullArray() {
        assertThrows(NullPointerException.class, () ->
                BinarySearch.binarySearch(null, 5)
        );
    }

    // Couvre L2, L3(false), L8 : tableau vide → -1
    @Test
    void testL2_L3_L8_emptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }

    // Couvre L2, L3, L4, L5 : élément trouvé au milieu
    @Test
    void testL5_elementFoundAtMid() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }

    // Couvre L6 : array[mid] <= element → low = mid + 1 (aller à droite)
    @Test
    void testL6_goRight() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }

    // Couvre L7 : array[mid] > element → high = mid - 1 (aller à gauche)
    @Test
    void testL7_goLeft() {
        assertEquals(1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 3));
    }

    // Couvre L8 : élément absent → -1
    @Test
    void testL8_elementNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
    }

    // Couvre L5 : tableau à un seul élément trouvé
    @Test
    void testL5_singleElementFound() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{7}, 7));
    }

    // Couvre L8 : tableau à un seul élément non trouvé
    @Test
    void testL8_singleElementNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{7}, 3));
    }
}