// Self 3. Power Calculation
import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take base and exponent as input
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power
        double result = Math.pow(base, exponent);

        // Display result
        System.out.println(base + " raised to " + exponent + " = " + result);

        sc.close();
    }
}

