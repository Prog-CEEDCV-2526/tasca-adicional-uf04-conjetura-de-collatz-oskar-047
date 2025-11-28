package gvaCEED;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollatzLogicTest {

    @Test
    void testNextEven() {
        assertEquals(4, CollatzLogic.next(8), "8 és parell, així que 8/2 = 4");
    }

    @Test
    void testNextOdd() {
        assertEquals(16, CollatzLogic.next(5), "5 és senar, així que 5*3+1 = 16");
    }

    @Test
    void testNextThrowsForZero() {
        assertThrows(IllegalArgumentException.class, () -> CollatzLogic.next(0));
    }

    @Test
    void testNextThrowsForNegative() {
        assertThrows(IllegalArgumentException.class, () -> CollatzLogic.next(-10));
    }

    @Test
    void testStepsForKnownValue() {
        // Exemples coneguts de la seqüència de Collatz
        assertEquals(7, CollatzLogic.stepsToReachOne(3));   // 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
        assertEquals(0, CollatzLogic.stepsToReachOne(1));   // Ja és 1
        assertEquals(1, CollatzLogic.stepsToReachOne(2));   // 2 → 1
    }

    @Test
    void testStepsThrowsForZero() {
        assertThrows(IllegalArgumentException.class, () -> CollatzLogic.stepsToReachOne(0));
    }

    @Test
    void testStepsThrowsForNegative() {
        assertThrows(IllegalArgumentException.class, () -> CollatzLogic.stepsToReachOne(-5));
    }
}
