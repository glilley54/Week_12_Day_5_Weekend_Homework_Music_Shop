import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("blue", "electric", "plastic", "Fender", 6);

    }

    @Test
    public void getcolour() {
        assertEquals("blue", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("I'm a guitar and I'm playing", guitar.makeSound());
    }

}

