import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("black","electric","plastic","Yamaha","Large");

    }
    @Test
    public void hasColour(){
        assertEquals("black", keyboard.getColour());

    }

}
