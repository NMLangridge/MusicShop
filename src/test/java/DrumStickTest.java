import org.junit.Before;
import org.junit.Test;
import shop.DrumStick;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick(2.00, 8.00, "Vic Firth American Classic 5A");
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(2.00, drumStick.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(8.00, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals("Vic Firth American Classic 5A", drumStick.getType());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(6.00, drumStick.calculateMarkup(), 0.01);
    }

}
