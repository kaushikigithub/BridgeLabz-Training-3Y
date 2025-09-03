import java.util.Scanner;

class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            // Using formula
            int formulaSum = n * (n + 1) / 2;

            // Using while loop
            int i = 1, whileSum = 0;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Both results are equal? " + (formulaSum == whileSum));
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
