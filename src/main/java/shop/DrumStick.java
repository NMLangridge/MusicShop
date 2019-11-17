package shop;

public class DrumStick extends Accessory {

    public DrumStick(double boughtPrice, double sellPrice, String type) {
        super(boughtPrice, sellPrice, type);
    }

    public double calculateMarkup() {
        return (getSellPrice() - getBoughtPrice());
    }

}
