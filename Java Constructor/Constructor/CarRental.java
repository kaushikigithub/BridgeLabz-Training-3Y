class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 1000.0; // fixed rate

    // Default constructor
    public CarRental() {
        this("Unknown", "Economy", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate cost
    private double calculateCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                           ", Days: " + rentalDays + ", Total Cost: " + calculateCost());
    }
}
