package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import shop.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay, ISell {

    private String type;
    private String material;
    private String colour;

    public Instrument(double boughtPrice, double sellPrice, String type, String material, String colour) {
        super(boughtPrice, sellPrice);
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
