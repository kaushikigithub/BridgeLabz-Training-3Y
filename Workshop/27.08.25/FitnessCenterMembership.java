import java.util.Scanner;

public class FitnessCenterMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean centerOpen = true; // while loop → keep registering until admin exits

        while (centerOpen) {
            System.out.println("\n=== Welcome to Fitness Center Membership System ===");

            int numMembers;
            // do-while → ensure at least one member is registered
            do {
                System.out.print("Enter number of members to register (at least 1): ");
                numMembers = sc.nextInt();
            } while (numMembers < 1);

            // for loop → handle multiple members in this batch
            for (int i = 1; i <= numMembers; i++) {
                System.out.println("\n--- Registering Member " + i + " ---");

                // switch-case → membership type
                System.out.println("Choose Membership Type:");
                System.out.println("1. Monthly - Rs.2000");
                System.out.println("2. Quarterly - Rs.5000");
                System.out.println("3. Yearly - Rs.18000");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                int fee = 0;
                switch (choice) {
                    case 1:
                        fee = 2000;
                        System.out.println("Monthly Membership selected.");
                        break;
                    case 2:
                        fee = 5000;
                        System.out.println("Quarterly Membership selected.");
                        break;
                    case 3:
                        fee = 18000;
                        System.out.println("Yearly Membership selected.");
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        fee = 2000;
                }

                // if-else → discount eligibility
                System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                String discountAns = sc.next();
                if (discountAns.equalsIgnoreCase("yes")) {
                    double discount = 0.20 * fee; // 20% discount
                    fee -= discount;
                    System.out.println("Discount applied: " + discount);
                } else {
                    System.out.println("No discount applied.");
                }

                System.out.println("Final Fee for Member " + i + ": Rs." + fee);
            }

            // while loop → continue until admin exits
            System.out.print("\nDo you want to register more members? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                centerOpen = false;
            }
        }

        System.out.println("\nFitness Center Closed. Thank you!");
        sc.close();
    }
}
