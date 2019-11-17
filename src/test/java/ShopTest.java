import instruments.Bass;
import instruments.DrumKit;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Bass bass;
    DrumKit drumKit;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(150.00,500.00,"String", "Swamp Ash", "Red", 6);
        bass = new Bass(75.00,300.00,"String", "Alder", "Blue", 4);
        drumKit = new DrumKit(350.00,900.00,"Percussion", "Maple", "Yellow", 5);
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar);
        shop.addStock(bass);
        shop.addStock(drumKit);
        assertEquals(3, shop.totalStock());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar);
        shop.addStock(bass);
        shop.addStock(drumKit);
        shop.removeStock(guitar);
        assertEquals(2, shop.totalStock());
    }

}
