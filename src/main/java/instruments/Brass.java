package instruments;

public class Brass extends Instrument{

    private int numberOfValves;
    private String mouthPieceSize;

    public Brass(int itemNumber, String make, String model, boolean saleItem, double costPrice, double retailPrice, int numberOfValves, String mouthPieceSize){
        super (itemNumber, make, model, saleItem, costPrice, retailPrice);
        this.numberOfValves = numberOfValves;
        this.mouthPieceSize = mouthPieceSize;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String getMouthPieceSize() {
        return mouthPieceSize;
    }
}
