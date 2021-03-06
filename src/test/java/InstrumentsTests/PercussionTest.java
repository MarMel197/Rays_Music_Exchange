package InstrumentsTests;

import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion percussion;
    Percussion tomTom;
    Percussion bass;
    Percussion snare;

    @Before
    public void setUp() {
        tomTom = new Percussion(100050, "Premier", "Pro Beat", false, 100.50, 199.99, 18, "Tomtom");
        bass = new Percussion(100060, "British Drum Co.", "Legend Series", true, 100, 200, 30, "Bass Drum");
        snare = new Percussion(100070, "Ludwig", "SQ1 Series", false, 200, 300, 20, "Snare");
    }

    @Test
    public void canGetItemNumber() {
        assertEquals(100050, tomTom.getItemNumber());
    }

    @Test
    public void canGetMake() {
        assertEquals("Premier", tomTom.getManufacturer());
    }

    @Test
    public void canGetModel() {
        assertEquals("Legend Series", bass.getModel());
    }

    @Test
    public void canCheckSaleItem__false() {
        assertEquals(false, tomTom.getSaleStatus());
    }

    @Test
    public void canCheckSaleItem__true() {
        assertEquals(true, bass.getSaleStatus());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(100.50, tomTom.getCostPrice(), 0.01);
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(199.99, tomTom.getRetailPrice(), 0.01);
    }

    @Test
    public void hasMadeNoSoundToStart() {
        assertEquals("", snare.getSoundMade());
    }

    @Test
    public void canPlaySound() {
        snare.playInstrument("Rat-a-tat-tat");
        assertEquals("Rat-a-tat-tat", snare.getSoundMade());
    }

    @Test
    public void canCalculateMarkup() {
        snare.calculateMarkup(300, 200);
        assertEquals(100.00, snare.getProfitMade(),0.01);
    }
}