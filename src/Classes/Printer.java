package Classes;

import Interfaces.Discount;

public class Printer extends Electronic implements Discount {
    private Integer printsPerMinute;

    //CONSTRUCTOR
    //region
    public Printer(Integer stock, String name, Integer price, String manufacturer, Integer printsPerMinute) {
        super(stock, name, price, manufacturer);
        this.printsPerMinute = printsPerMinute;
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return super.toString() +
                "\nPrints per minute: " + printsPerMinute;
    }

    @Override
    public Integer applyDiscount(Integer percentage) {
        return getPrice() - getPrice() * percentage / 100;
    }
    //endregion
}
