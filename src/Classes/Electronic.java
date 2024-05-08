package Classes;

import javax.swing.*;

public abstract class Electronic extends Product {
    private String manufacturer;

    //CONSTRUCTOR
    //region
    public Electronic(Integer stock, String name, Integer price, String manufacturer) {
        super(stock, name, price);
        this.manufacturer = manufacturer;
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return super.toString() +
                "\nManufacturer: " + manufacturer;
    }
    //endregion
}
