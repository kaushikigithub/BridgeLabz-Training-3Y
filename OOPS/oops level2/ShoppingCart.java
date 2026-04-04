class ShoppingCart {
    String itemName;
    double price;
    int quantity;

    // Constructor
    ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add item
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added.");
    }

    // Remove item
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    // Display total cost
    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart("Laptop", 50000, 1);
        cart1.addItem(1);
        cart1.removeItem(1);
        cart1.displayTotalCost();
    }
}
 