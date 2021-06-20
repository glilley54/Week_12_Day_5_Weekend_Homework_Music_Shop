import instruments.Guitar;
import instruments.Instrument;
import instruments.Keyboard;
import org.junit.Before;
import shop.ShopItems;

public class ShopItemsTest {
    Instrument instrument;
    ShopItems shopItems;
    Guitar guitar;
    Keyboard keyboard;

    @Before
    public void before() {
        guitar = new Guitar("red", "acoustic","wood","Taylor",12);
        shopItems = new ShopItems("Guitar",100,300);

    })




}
