import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.ShowStoreProducts();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void ShowStoreProducts() {
        String [] productNames = {"Acer Predator 21X", "Samsung Z Fold 3", "Rolex Submarine"};
        Double [] productPrice = {3599.00d, 6000.00d, 72900.00d};
        Integer [] stock = {10, 6, 10};


        System.out.println("ID \tNazwa produktu \t\t Cena \t\t Ilość");

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }

    }
}
