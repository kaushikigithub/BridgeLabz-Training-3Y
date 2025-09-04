class Vehicle {
    private String ownerName;
    private String vehicleType;

    // Class variable (fixed for all vehicles)
    private static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + 
                           ", Vehicle Type: " + vehicleType + 
                           ", Registration Fee: " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
}
