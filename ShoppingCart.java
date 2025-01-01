
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private String cartID;
    private String customerName;
    private List<Product> items;

    // Constructor to initialize the ShoppingCart
    public ShoppingCart(String cartID, String customerName) {
        this.cartID = cartID;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(Product product) {
        if (items.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println(product.getName() + " is not in the cart.");
        }
    }

    // Method to calculate the total cost of items in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Getter for cartID
    public String getCartID() {
        return cartID;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("1234", "Alice");

        // Creating some products
        Product apple = new Product("Apple", 0.99);
        Product bread = new Product("Bread", 2.49);
        Product milk = new Product("Milk", 1.79);

        // Adding items to the cart
        cart.addItem(apple);
        cart.addItem(bread);
        cart.addItem(milk);

        // Displaying total cost
        System.out.println("Total cost: $" + cart.calculateTotal());

        // Removing an item
        cart.removeItem(bread);

        // Displaying total cost after removal
        System.out.println("Total cost after removing bread: $" + cart.calculateTotal());
    }
}

// Product class to represent a product in the cart
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


