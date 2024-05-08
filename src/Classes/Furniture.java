package Classes;

public abstract class Furniture extends Product {
    //CONSTRUCTOR
    //region
    public Furniture(Integer stock, String name, Integer price) {
        super(stock, name, price);
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return super.toString();
    }
    //endregion
}
