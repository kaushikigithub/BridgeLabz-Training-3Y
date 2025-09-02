import java.util.Scanner;

public class CinemaSeatAllocation {
    static final int ROWS = 5;
    static final int SEATS = 10;
    static int[][] cinema = new int[ROWS][SEATS];  // 0 = empty, 1 = booked

    // Method to book consecutive seats
    public static boolean bookSeats(int familySize) {
        for (int row = 0; row < ROWS; row++) {
            int consecutive = 0;
            for (int col = 0; col < SEATS; col++) {
                if (cinema[row][col] == 0) {  // empty seat
                    consecutive++;
                    if (consecutive == familySize) {
                        // Found enough consecutive seats → book them
                        for (int k = col - familySize + 1; k <= col; k++) {
                            cinema[row][k] = 1;
                        }
                        System.out.println("Seats booked in row " + (row + 1));
                        return true;
                    }
                } else {
                    consecutive = 0; // reset counter if seat is occupied
                }
            }
        }
        return false; // no suitable seats found
    }

    // Display cinema seating
    public static void displaySeats() {
        System.out.println("\nCinema Seating (0 = empty, 1 = booked):");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < SEATS; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            displaySeats();
            System.out.print("\nEnter family size (enter 0 to exit): ");
            int familySize = sc.nextInt();

            if (familySize == 0) break;

            if (familySize > SEATS) {
                System.out.println("Family size too large for one row!");
                continue;
            }

            boolean booked = bookSeats(familySize);
            if (!booked) {
                System.out.println("Not available");
            }
        }
        sc.close();
    }
}
