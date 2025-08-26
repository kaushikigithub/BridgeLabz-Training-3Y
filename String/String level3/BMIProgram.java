import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;  // convert cm to m
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];   // [weight, height]
        String[][] results = new String[10][4];

        // Input weight & height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            hw[i][1] = sc.nextDouble();

            String[] bmiRes = calculateBMI(hw[i][0], hw[i][1]);
            results[i][0] = hw[i][0] + "";
            results[i][1] = hw[i][1] + "";
            results[i][2] = bmiRes[0];
            results[i][3] = bmiRes[1];
        }

        // Display table
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
}
