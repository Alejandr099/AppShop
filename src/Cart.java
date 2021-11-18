import java.util.ArrayList;
import java.util.List;

class Cart {

    List<Product> cartItems = new ArrayList<Product>();

    public void addProductToCartByProductId(int productId) {
        Product product = getProductByProductId(productId);
        addToCart(product);
    }

    private Product getProductByProductId(int productId) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getProductId() == productId) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }

    public void removeProductByProductId(int productId) {
        Product prod = getProductByProductId(productId);
        cartItems.remove(prod);
    }

    void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }

}