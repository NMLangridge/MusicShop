import instruments.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before() {
        bass = new Bass(75.00,300.00,"String", "Alder", "Blue", 4);
    }

    @Test
    public void hasType() {
        assertEquals("String", bass.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Alder", bass.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", bass.getColour());
    }

    @Test
    public void makeSound() {
        assertEquals("Groovy Bass Riff!", bass.makeSound());
    }

    @Test
    public void hasStrings() {
        assertEquals(4, bass.getNumberOfStrings());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(225.00, bass.calculateMarkup(), 0.01);
    }

}
