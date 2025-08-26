public class NullPointerDemo {
    // Method to generate exception
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }

    // Method to handle exception
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see abrupt stop
        handleException();
    }
}
