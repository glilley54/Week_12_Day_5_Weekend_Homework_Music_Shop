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
    @Test
    public void makesSound(){
        assertEquals("I'm a Keyboard playing!", keyboard.makeSound());
    }
    @Test
    public void hasSize(){
        assertEquals("Large", keyboard.getSize());
    }
}
