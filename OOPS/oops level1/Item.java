class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(201, "Laptop", 55000);
        item1.displayItem();
        int qty = 2;
        System.out.println("Total cost for " + qty + " items: " + item1.calculateTotalCost(qty));
    }
}
