package shop;

public class GuitarPick extends Accessory {

    public GuitarPick(double boughtPrice, double sellPrice, String type) {
        super(boughtPrice, sellPrice, type);
    }

    public double calculateMarkup() {
        return (getSellPrice() - getBoughtPrice());
    }

}
