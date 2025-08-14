// Self 2. Perimeter of a Rectangle
import java.util.Scanner;

class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take length and width as input
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display result
        System.out.println("Perimeter of rectangle = " + perimeter);

        sc.close();
    }
}
