import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int originalNumber = number;

        // Handle 0 explicitly (since loop won’t run)
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10; // Remove last digit
                count++;      // Increment digit count
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}
