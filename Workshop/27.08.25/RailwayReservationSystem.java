import java.util.Scanner;

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assume train has limited seats
        int totalSeats = 5;
        int bookedSeats = 0;
        int waitingList = 0;

        boolean trainOpen = true; // while loop → continue until train full

        while (trainOpen) {
            System.out.println("\n=== Welcome to Railway Reservation System ===");
            int passengers;

            // do-while → at least one booking attempt must be made
            do {
                System.out.print("Enter number of passengers to book (at least 1): ");
                passengers = sc.nextInt();
            } while (passengers < 1);

            // for loop → take booking requests for each passenger
            for (int i = 1; i <= passengers; i++) {
                System.out.println("\n--- Booking for Passenger " + i + " ---");

                // switch-case → train options with fares
                System.out.println("Select Train:");
                System.out.println("1. Express Train - Rs.1000");
                System.out.println("2. Superfast Train - Rs.1500");
                System.out.println("3. Luxury Train - Rs.2500");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                int fare = 0;
                switch (choice) {
                    case 1:
                        fare = 1000;
                        System.out.println("Express Train selected.");
                        break;
                    case 2:
                        fare = 1500;
                        System.out.println("Superfast Train selected.");
                        break;
                    case 3:
                        fare = 2500;
                        System.out.println("Luxury Train selected.");
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Express Train.");
                        fare = 1000;
                }

                // if-else → check seat availability
                if (bookedSeats < totalSeats) {
                    bookedSeats++;
                    System.out.println("Seat confirmed. Fare: Rs." + fare);
                } else {
                    waitingList++;
                    System.out.println("No seats available! Added to Waiting List #" + waitingList);
                }
            }

            // Check if train is full (all seats + waiting list limit)
            if (bookedSeats >= totalSeats) {
                System.out.println("\nAll seats are booked. Reservation closed!");
                trainOpen = false; // while loop ends
            } else {
                System.out.print("\nDo you want to continue booking? (yes/no): ");
                String ans = sc.next();
                if (ans.equalsIgnoreCase("no")) {
                    trainOpen = false;
                }
            }
        }

        System.out.println("\nFinal Summary:");
        System.out.println("Seats Booked: " + bookedSeats);
        System.out.println("Waiting List: " + waitingList);
        System.out.println("Thank you for using Railway Reservation System!");
        
        sc.close();
    }
}

