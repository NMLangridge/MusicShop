import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(150.00,500.00,"String", "Swamp Ash", "Red", 6);
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Swamp Ash", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void makeSound() {
        assertEquals("Crazy Guitar Solo!", guitar.makeSound());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(350.00, guitar.calculateMarkup(), 0.01);
    }

}
