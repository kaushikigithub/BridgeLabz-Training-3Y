import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Step 1: Loop through digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;      // Get last digit
            sum += digit * digit * digit;        // Add cube of digit
            originalNumber /= 10;                // Remove last digit
        }

        // Step 2: Compare with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
