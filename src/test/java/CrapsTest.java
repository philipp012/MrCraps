import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

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

    @Test
    public void testSecondRoundLooseReturn7() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(1, 4, 3, 4);
        testee = new Craps(dice);

        assertFalse(testee.play());
    }

    @Test
    public void testThirdRoundVicroyReturn4() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(2, 2, 2, 3, 2, 3);
        testee = new Craps(dice);

        assertTrue(testee.play());

        verify(dice, times(6)).roll();
    }

    @Test
    public void testThirdRoundLooseReturn7() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(2, 2, 2, 3, 4, 3);
        testee = new Craps(dice);

        assertFalse(testee.play());
    }

    @Test
    public void testFourthRoundVicroyReturn4() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(2, 2, 2, 3, 2, 2, 2,3);
        testee = new Craps(dice);

        assertTrue(testee.play());

    }

    @Test
    public void testFourthRoundLooseReturn7() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(2, 2, 2, 3, 4, 2, 4, 3);
        testee = new Craps(dice);

        assertFalse(testee.play());
    }
}
