// Self 1. Calculate Simple Interest
import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take principal, rate, and time as input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
