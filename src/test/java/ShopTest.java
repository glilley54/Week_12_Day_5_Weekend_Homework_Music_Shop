import org.junit.Before;
import org.junit.Test;
import shop.ShopItems;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    ShopItems shopitem;
    shop Shop;

    @Before
    public void before(){
        shopitem = new ShopItems("Guitar",100,300);



    }

    @Test
    public void ItemHasDescription(){
        assertEquals("Guitar",shopitem.getDescription());
    }
    @Test
    public void canAddItemToStock(){
        shop.addToStock(shopitem);
        assertEquals(1,shop.getStockCount);

    }
}
