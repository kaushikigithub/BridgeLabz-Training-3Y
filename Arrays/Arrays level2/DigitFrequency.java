import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Frequency array of size 10 (for digits 0-9)
        int[] freq = new int[10];

        // Process digits
        while (num > 0) {
            int digit = (int)(num % 10);  // extract last digit
            freq[digit]++;                // increase its count
            num = num / 10;               // remove last digit
        }

        // Display frequency of digits
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
