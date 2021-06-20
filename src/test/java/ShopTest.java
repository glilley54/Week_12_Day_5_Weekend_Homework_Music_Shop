import org.junit.Before;
import org.junit.Test;
import shop.ShopItems;
import shop.Shop;
import shop.ISell;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    ShopItems shopItems;
    Shop shop;

    @Before
    public void before(){
       shopItems = new ShopItems("Guitar",100,300);




    }

    @Test
    public void ItemHasDescription(){
        assertEquals("Guitar",shopItems.getDescription());
    }

    @Test
    public void canAddItemToStock(){
        shop.addStock(shopItems);
        assertEquals(1,shop.getStockCount());

    }
}
