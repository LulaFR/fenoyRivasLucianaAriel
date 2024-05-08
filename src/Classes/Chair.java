package Classes;

import Interfaces.Discount;

public class Chair extends Furniture implements Discount {
    private Boolean wheels;

    //CONSTRUCTOR
    //region
    public Chair(Integer stock, String name, Integer price, Boolean wheels) {
        super(stock, name, price);
        this.wheels = wheels;
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return super.toString() +
                (wheels ? "\nHas wheels" : "\nDoesn't have wheels");
    }

    @Override
    public Integer applyDiscount(Integer percentage) {
        return getPrice() - getPrice() * percentage / 100;
    }

    //endregion
}
