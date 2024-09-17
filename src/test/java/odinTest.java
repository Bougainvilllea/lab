import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class odinTest {

    @Test
    void fizzBuzz() {
        assertEquals("fizz", odin.FizzBuzz(30));
        assertEquals("buzz", odin.FizzBuzz(77));
        assertEquals("fizzbuzz", odin.FizzBuzz(35));
        assertEquals("22", odin.FizzBuzz(22));
    }
}