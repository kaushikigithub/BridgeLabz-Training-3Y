class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // Display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker pc1 = new PalindromeChecker("madam");
        pc1.displayResult();
    }
}
