import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class threeTest {

    @Test
    void abs() {
        assertEquals("NET VESHESTVENNOH KORNEY", three.Abs(222, 1, 555));
        assertEquals("x1 = -1.0; x2 = -6.0", three.Abs(1, 7, 6));
    }
}