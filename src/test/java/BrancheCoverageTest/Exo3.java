package test.java.BrancheCoverageTest;


import main.java.BinarySearch;
import main.java.BinarySearchCorrection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo3{


    @Test
    void testB1_true_nullArray() {
        assertThrows(NullPointerException.class, () ->
                BinarySearch.binarySearch(null, 5)
        );
    }

    // B1 = FALSE → continue normalement
    @Test
    void testB1_false_notNull() {
        assertDoesNotThrow(() ->
                BinarySearch.binarySearch(new int[]{1, 3, 5}, 3)
        );
    }

    // ───────────────────────────────────────────
    // B2 : low <= high
    // ───────────────────────────────────────────

    // B2 = FALSE dès le départ → tableau vide → -1
    @Test
    void testB2_false_emptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }

    // B2 = TRUE → entre dans la boucle
    @Test
    void testB2_true_enterLoop() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }

    // B2 = TRUE puis FALSE après épuisement → élément absent
    @Test
    void testB2_true_then_false_notFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
    }

    // ───────────────────────────────────────────
    // B3 : array[mid] == element
    // ───────────────────────────────────────────

    // B3 = TRUE → trouvé → return mid
    @Test
    void testB3_true_elementFound() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }

    // B3 = FALSE → pas au milieu → continuer
    @Test
    void testB3_false_notAtMid() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }

    // ───────────────────────────────────────────
    // B4 : array[mid] <= element
    // ───────────────────────────────────────────

    // B4 = TRUE → aller à droite
    @Test
    void testB4_true_goRight() {
        assertEquals(4, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 9));
    }

    // B4 = FALSE → aller à gauche
    @Test
    void testB4_false_goLeft() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 1));
    }
}