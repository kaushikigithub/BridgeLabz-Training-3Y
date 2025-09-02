import java.util.Scanner;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean moreCustomers = true;

        while (moreCustomers) {
            System.out.println("\n=== Welcome to Online Shopping ===");

            int totalAmount = 0;

            // Ensure at least 1 product is added using do-while
            int numItems;
            do {
                System.out.print("Enter number of products you want to buy (at least 1): ");
                numItems = sc.nextInt();
            } while (numItems < 1);

            // Product menu + loop for items
            for (int i = 0; i < numItems; i++) {
                System.out.println("\nChoose a product:");
                System.out.println("1. Mobile - Rs.20000");
                System.out.println("2. Headphones - Rs.2000");
                System.out.println("3. Shoes - Rs.3000");
                System.out.println("4. Watch - Rs.5000");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        totalAmount += 20000;
                        System.out.println("Added Mobile");
                        break;
                    case 2:
                        totalAmount += 2000;
                        System.out.println("Added Headphones");
                        break;
                    case 3:
                        totalAmount += 3000;
                        System.out.println("Added Shoes");
                        break;
                    case 4:
                        totalAmount += 5000;
                        System.out.println("Added Watch");
                        break;
                    default:
                        System.out.println("Invalid choice! Skipping...");
                }
            }

            // Discount logic
            System.out.println("\nTotal Amount before discount: " + totalAmount);
            if (totalAmount > 5000) {
                double discount = 0.10 * totalAmount;  // 10% discount
                totalAmount -= discount;
                System.out.println("Discount Applied: " + discount);
            }
            System.out.println("Final Amount to Pay: " + totalAmount);

            // Handle multiple customers
            System.out.print("\nNext customer? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                moreCustomers = false;
            }
        }

        System.out.println("\nThank you for shopping with us!");
        sc.close();
    }
}
