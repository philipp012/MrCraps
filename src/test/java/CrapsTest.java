import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CrapsTest {
        private Craps testee;

    @Test
    public void testFirstRoundVicroyReturn7() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(3).thenReturn(4);
        testee = new Craps(dice);

        assertTrue(testee.play());
    }

    @Test
    public void testFirstRoundLooseReturn2() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(1).thenReturn(1);
        testee = new Craps(dice);

        assertFalse(testee.play());
    }

    @Test
    public void testSecondRoundVicroyReturn10() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(5).thenReturn(5);
        testee = new Craps(dice);

        assertTrue(testee.play());
    }
}
