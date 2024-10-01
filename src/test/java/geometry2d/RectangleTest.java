package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals(4, rectangle.area());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals("Rectangle: 4.0", rectangle.toString());
    }
}