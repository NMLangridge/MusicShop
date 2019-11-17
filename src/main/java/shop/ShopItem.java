package shop;

import behaviours.ISell;

public abstract class ShopItem implements ISell {

    private double boughtPrice;
    private double sellPrice;

    public ShopItem(double boughtPrice, double sellPrice) {
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

}
