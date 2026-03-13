package test.java.ConditionCoverageTest;



import main.java.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo6 {


    @Test
    void testC1_true_zero() {
        assertThrows(IllegalArgumentException.class, () ->
                FizzBuzz.fizzBuzz(0)
        );
    }


    @Test
    void testC1_true_negative() {
        assertThrows(IllegalArgumentException.class, () ->
                FizzBuzz.fizzBuzz(-5)
        );
    }


    @Test
    void testC1_false_positive() {
        assertDoesNotThrow(() ->
                FizzBuzz.fizzBuzz(1)
        );
    }

    @Test
    void testC2_true_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }


    @Test
    void testC2_false_notMultiple15() {
        assertNotEquals("FizzBuzz", FizzBuzz.fizzBuzz(3));
    }


    @Test
    void testC3_true_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void testC3_false_notMultiple3() {
        assertNotEquals("Fizz", FizzBuzz.fizzBuzz(7));
    }


    @Test
    void testC4_true_buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }


    @Test
    void testC4_false_number() {
        assertEquals("11", FizzBuzz.fizzBuzz(11));
    }
 // C1=FALSE, C2=FALSE, C3=FALSE, C4=FALSE : n=1 (corrige)
    @Test
    void testOneValid() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void testFizzBuzz30() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
}
