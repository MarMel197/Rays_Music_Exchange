package InstrumentsTests;

import instruments.Stringed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringedTest {

    Stringed electricGuitar;

    @Before
    public void setUp() {
        electricGuitar = new Stringed(100050, "Fender", "Stratocaster", false, 100.50,199.99, 6, "Electric");
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, electricGuitar.getStringQty());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("Electric", electricGuitar.getGuitarType());
    }
}
