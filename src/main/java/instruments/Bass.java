package instruments;

public class Bass extends Instrument {

    private int numberOfStrings;

    public Bass(double boughtPrice, double sellPrice, String type, String material, String colour, int numberOfStrings) {
        super(boughtPrice, sellPrice, type, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public String makeSound() {
        return "Groovy Bass Riff!";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double calculateMarkup() {
        return (getSellPrice() - getBoughtPrice());
    }

}
