import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fiveTest {

    @Test
    void makeInstall() {
        assertEquals(false, five.MakeInstall("321"));
        assertEquals(true, five.MakeInstall("ggg"));
    }
}