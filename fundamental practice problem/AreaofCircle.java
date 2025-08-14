// 4. Area of a Circle
import java.util.Scanner;

class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take radius as input
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display result
        System.out.println("Area of circle = " + area);

        sc.close();
    }
}
