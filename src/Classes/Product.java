package Classes;

public class Product {
    private Integer stock;
    private String name;
    private Integer price;

    //CONSTRUCTOR
    //region
    public Product(Integer stock, String name, Integer price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }
    //endregion
    //G&S
    //region

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    //endregion
    //METHODS
    //region
    @Override
    public String toString() {
        return "--" + name + "--" +
                "\nStock: " + stock +
                "\nPrice: $" + price;
    }

    public static Integer increasePrice(Integer price, Integer percentage) {
        return price + price * percentage / 100;
    } //La hice estática por mi interpretación de la consigna, pero no me convence
    //endregion
}
