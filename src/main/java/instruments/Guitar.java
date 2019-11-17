package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(double boughtPrice, double sellPrice, String type, String material, String colour, int numberOfStrings) {
        super(boughtPrice, sellPrice, type, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public String makeSound() {
        return "Crazy Guitar Solo!";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double calculateMarkup() {
        return (getSellPrice() - getBoughtPrice());
    }

}
