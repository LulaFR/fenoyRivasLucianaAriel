package Classes;

public class Laptop extends Electronic {
    private Integer memoryInGB;

    //CONSTRUCTOR
    //region
    public Laptop(Integer stock, String name, Integer price, String manufacturer, Integer memoryInGB) {
        super(stock, name, price, manufacturer);
        this.memoryInGB = memoryInGB;
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return super.toString() +
                "\nMemory: " + memoryInGB + " GB";
    }
    //endregion
}
