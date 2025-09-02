public class EmployeeSalarySlip {
    public static void main(String[] args) {
        // Employee data
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] basicSalary = {40000, 60000, 50000};

        System.out.println("=== Employee Salary Slips ===\n");

        for (int i = 0; i < names.length; i++) {
            int basic = basicSalary[i];

            // Calculate allowances
            double hra = 0.20 * basic; // 20%
            double da = 0.10 * basic;  // 10%
            double gross = basic + hra + da;

            // Apply tax if salary > 50,000
            double tax = 0;
            if (gross > 50000) {
                tax = 0.10 * gross;
            }

            double netSalary = gross - tax;

            // Print salary slip
            System.out.println("Employee: " + names[i]);
            System.out.println("Basic Salary: " + basic);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Gross Salary: " + gross);
            System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + netSalary);
            System.out.println("-----------------------------");
        }
    }
}
