import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dvaTest {

    @Test
    void makeInstall() {
        assertEquals("llatsni ekam", dva.MakeInstall("make install"));
        assertEquals("123", dva.MakeInstall("321"));
    }
}