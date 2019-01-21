import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CrapsTest {
        Craps craps;

    @Test
    public void testFirstRoundVicroy() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(3).thenReturn(4);
        craps = new Craps(dice);
    }
}
