package Uppgiften;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Testfall {

    @Test
    //objekt av texstats via konstruktor
    public void testEmptyLine() {
        Textstats ts = new Textstats();
        ts.readLine("");
        assertEquals(0, ts.getTotalCharacters());
        assertEquals(1, ts.getTotalLines());
    }

    @Test
    //objekt av texstats via konstruktor
    public void testCountCharacters() {
        Textstats ts = new Textstats();
        ts.readLine("Hello World");
        assertEquals(11, ts.getTotalCharacters()); // "Hello World" har 11 tecken inkl. mellanslag
        assertEquals(1, ts.getTotalLines());
    }

    @Test

    //objekt av texstats via konstruktor
    public void testCheckForStop() {
        Textstats ts = new Textstats();
        assertTrue(ts.checkForStop("stop"));
        assertTrue(ts.checkForStop("STOP"));
        assertFalse(ts.checkForStop("continue"));
    }
}
