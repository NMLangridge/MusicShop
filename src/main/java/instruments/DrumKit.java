package instruments;

public class DrumKit extends Instrument {

    private int numberOfDrums;

    public DrumKit(double boughtPrice, double sellPrice, String type, String material, String colour, int numberOfDrums) {
        super(boughtPrice, sellPrice, type, material, colour);
        this.numberOfDrums = numberOfDrums;
    }

    public String makeSound() {
        return "Pounding Drum Beat!";
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public double calculateMarkup() {
        return (getSellPrice() - getBoughtPrice());
    }

}
