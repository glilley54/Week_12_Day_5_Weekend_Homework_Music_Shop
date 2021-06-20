import instruments.Guitar;
import instruments.Instrument;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;
import shop.ShopItems;

import static org.junit.Assert.assertEquals;

public class ShopItemsTest {
    Instrument instrument;
    ShopItems shopItems;
    Guitar guitar;
    Keyboard keyboard;

    @Before
    public void before() {
        guitar = new Guitar("red", "acoustic","wood","Taylor",12);
        shopItems = new ShopItems("Guitar",100,300);

    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100,shopItems.getBuyPrice());

    }
    @Test
    public void canCalculateMargin(){
        assertEquals(200, shopItems.calculateMarkup());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300,shopItems.getSellPrice());
    }
    @Test
    public void hasDescription(){
        assertEquals("Guitar",shopItems.getDescription());
    }


}
