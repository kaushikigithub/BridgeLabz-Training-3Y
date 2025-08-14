// Self 4. Calculate Average of Three Numbers
import java.util.Scanner;

class Average3Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take three numbers as input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Display result
        System.out.println("Average = " + average);

        sc.close();
    }
}
