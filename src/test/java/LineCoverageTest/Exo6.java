package test.java.LineCoverageTest;



import main.java.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Exo6{


    @Test
    void testL1_zeroThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                FizzBuzz.fizzBuzz(0)
        );
    }


    @Test
    void testL1_negativeThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                FizzBuzz.fizzBuzz(-3)
        );
    }


    @Test
    void testL2_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }


    @Test
    void testL3_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void testL4_buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));
    }


    @Test
    void testL5_number() {
        assertEquals("1",  FizzBuzz.fizzBuzz(1));
        assertEquals("7",  FizzBuzz.fizzBuzz(7));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
    }
}