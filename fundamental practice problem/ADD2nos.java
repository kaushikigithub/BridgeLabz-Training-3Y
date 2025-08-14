// 2. Add Two Numbers
import java.util.Scanner;

class ADD2nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Calculate sum
        double sum = num1 + num2;

        // Display result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
