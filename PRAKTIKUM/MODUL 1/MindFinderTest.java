import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MindFinderTest {

    private MindFinder MindFinder;

    @Test
    public void testScenario1() {
        int result = MindFinder.findMind(1, 2, 3);
        assertEquals(2, result);
    }

    @Test
    public void testScenario2() {
        int result = MindFinder.findMind(-1, -2, -3);
        assertEquals(-3, result);
    }

    @Test
    public void testScenario3() {
        int result = MindFinder.findMind(0, 0, 1);
        assertEquals(0, result);
    }
}
