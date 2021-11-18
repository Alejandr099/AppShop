
import java.util.List;
import java.util.Scanner;

public class App {

    Cart cart = new Cart();
    private int ch = 0;

    public App () {
        menu();
    }

    public void ShowMenu () {
        System.out.println();
        System.out.println("Witaj! Gdzie chcesz przejść?");
        System.out.println("1. Pokaz produkty sklepu.");
        System.out.println("2. Pokaz koszyk.");
        System.out.println("0. Wyjdź");
        System.out.println();
    }

    public void storeProductsMenu() {
        System.out.println();
        System.out.println();
        System.out.println("1. Dodaj produkt do koszyka.");
        System.out.println("2. Usuń produkt z koszyka.");
        System.out.println("0. Wyjdź");
        System.out.println();
    }

    public void menu () {
        do {
            ShowMenu();
            getInput();

            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getInput();
                    Choose();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void Choose() {
        switch (ch) {
            case 1:
                addToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:

                break;
        }
    }

    private int getInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getProductId() + " - " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }

    private void addToCart() {
        int productId = getInput();
        cart.addProductToCartByProductId(productId);
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int productId = getInput();
        cart.removeProductByProductId(productId);
    }
}