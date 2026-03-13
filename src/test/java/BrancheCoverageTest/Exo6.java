package test.java.BrancheCoverageTest;


 import main.java.FizzBuzz;
 import main.java.FizzBuzzCorrection;
 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo6 {


    @Test
    void testB1_true_invalid() {
        assertThrows(IllegalArgumentException.class, () ->
                FizzBuzz.fizzBuzz(0)
        );
    }


    @Test
    void testB3_true_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }


    @Test
    void testB5_true_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testB7_true_buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testB8_false_number() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void testOneIsValid() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }


    @Test
    void testB3_true_another15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
}
