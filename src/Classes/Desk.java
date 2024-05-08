package Classes;

public class Desk extends Furniture {
    private Double width;
    private Double length;

    //CONSTRUCTOR
    //region
    public Desk(Integer stock, String name, Integer price, Double width, Double length) {
        super(stock, name, price);
        this.width = width;
        this.length = length;
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return super.toString() +
                "\nWidth: " + width + " cm" +
                "\nLength: " + length + " cm";
    }
    //endregion
}
