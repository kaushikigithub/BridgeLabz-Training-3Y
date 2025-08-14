// Self 5. Convert Kilometers to Miles
import java.util.Scanner;

class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take distance in kilometers as input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Display result
        System.out.println("Distance in miles = " + miles);

        sc.close();
    }
}
