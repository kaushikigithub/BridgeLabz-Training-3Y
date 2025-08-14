// 5. Volume of a Cylinder
import java.util.Scanner;

class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take radius and height as input
        System.out.print("Enter radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble();

        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Display result
        System.out.println("Volume of cylinder = " + volume);

        sc.close();
    }
}
