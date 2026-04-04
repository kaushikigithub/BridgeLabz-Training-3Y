class Employee {
    public int employeeID;       // Public
    protected String department; // Protected
    private double salary;       // Private

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify private variable
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

// Subclass demonstrating access
class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        // Accessing public (employeeID) and protected (department)
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team Size: " + teamSize);
    }
}
