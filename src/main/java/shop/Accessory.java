package shop;

public abstract class Accessory extends ShopItem {

    private String type;

    public Accessory(double boughtPrice, double sellPrice, String type) {
        super(boughtPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
