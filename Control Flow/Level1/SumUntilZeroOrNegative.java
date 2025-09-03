import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }
            total += input;
        }

        System.out.println("Total sum = " + total);
    }
}
import java.util.Scanner;

class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Using formula
            int formulaSum = n * (n + 1) / 2;

            // Using for loop
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);
            System.out.println("Both results are equal? " + (formulaSum == forSum));
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
