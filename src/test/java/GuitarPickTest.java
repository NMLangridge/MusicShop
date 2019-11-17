import org.junit.Before;
import org.junit.Test;
import shop.GuitarPick;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {

    GuitarPick guitarPick;

    @Before
    public void before() {
        guitarPick = new GuitarPick(0.05, 0.50, "Dunlop Jazz III");
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(0.05, guitarPick.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(0.50, guitarPick.getSellPrice(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals("Dunlop Jazz III", guitarPick.getType());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(0.45, guitarPick.calculateMarkup(), 0.01);
    }

}
