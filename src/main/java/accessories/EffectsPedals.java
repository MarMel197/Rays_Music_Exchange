package accessories;

import behaviours.ISell;

public class EffectsPedals extends Accessory implements ISell {

    public EffectsPedals(String name, double buyingPrice, double sellingPrice) {
        super(name, buyingPrice, sellingPrice);
    }

    public void calculateMarkup(double sellingPrice, double buyingPrice){
        this.markUp = sellingPrice - buyingPrice;
    }
}