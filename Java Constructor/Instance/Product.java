class Product {
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase when a product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
