import instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void before() {
        drumKit = new DrumKit(350.00,900.00,"Percussion", "Maple", "Yellow", 5);
    }

    @Test
    public void hasType() {
        assertEquals("Percussion", drumKit.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Maple", drumKit.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Yellow", drumKit.getColour());
    }

    @Test
    public void makeSound() {
        assertEquals("Pounding Drum Beat!", drumKit.makeSound());
    }

    @Test
    public void hasDrums() {
        assertEquals(5, drumKit.getNumberOfDrums());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(550.00, drumKit.calculateMarkup(), 0.01);
    }

}
