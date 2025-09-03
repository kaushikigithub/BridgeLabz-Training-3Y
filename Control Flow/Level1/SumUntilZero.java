import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double input;

        System.out.print("Enter a number (0 to stop): ");
        input = sc.nextDouble();

        while (input != 0) {
            total += input;
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);
    }
}
