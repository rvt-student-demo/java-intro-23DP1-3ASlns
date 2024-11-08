package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    // Method to print product information
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }

    // Main method for testing
    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct(); // Expected output: Banana, price 1.1, 13 pcs
    }
}

