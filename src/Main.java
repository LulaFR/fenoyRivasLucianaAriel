import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Desk(13, "Escritorio plegable", 100, 70D, 1.4D));
        products.add(new Chair(26, "Silla plegable", 60, false));
        products.add(new Laptop(8, "Mini Laptop Acer", 370, "Lula", 256));
        products.add(new Printer(18, "OKI", 360, "Pirulo", 55));

        for (Product p : products) {
            if (p instanceof Laptop) {
                System.out.println("LAPTOP"); //indico tipo de instancia
                System.out.println(p);

                System.out.println("\nPrecio sin aumento: $" + p.getPrice());
                p.setPrice(Product.increasePrice(p.getPrice(), 20));
                System.out.println("Precio con aumento: $" + p.getPrice());
            }
            if (p instanceof Chair) {
                System.out.println("CHAIR"); //indico tipo de instancia
                System.out.println(p);
                System.out.println("Precio con descuento: $" + ((Chair) p).applyDiscount(15));

                System.out.println("\nPrecio sin aumento: $" + p.getPrice());
                p.setPrice(Product.increasePrice(p.getPrice(), 5));
                System.out.println("Precio con aumento: $" + p.getPrice());
            }
            if (p instanceof Desk) {
                System.out.println("DESK"); //indico tipo de instancia
                System.out.println(p);

                System.out.println("\nPrecio sin aumento: $" + p.getPrice());
                p.setPrice(Product.increasePrice(p.getPrice(), 10));
                System.out.println("Precio con aumento: $" + p.getPrice());
            }
            if (p instanceof Printer) {
                System.out.println("PRINTER"); //indico tipo de instancia
                System.out.println(p);
                System.out.println("Precio con descuento: $" + ((Printer) p).applyDiscount(10));

                System.out.println("\nPrecio sin aumento: $" + p.getPrice());
                p.setPrice(Product.increasePrice(p.getPrice(), 15));
                System.out.println("Precio con aumento: $" + p.getPrice());
            }
            System.out.println("\n\n");
        }

        /*Las clases Product, Furniture y Electronic las hice abstractas solo para que no puedan instanciarse,
        más allá de que actualmente no tengan ningún método abstracto*/
    }
}