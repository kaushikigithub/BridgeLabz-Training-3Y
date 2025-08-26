import java.util.Scanner;

public class FirstNonRepeatingChar {
    
    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // Array to store frequency of ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // Return null character if no non-repeating char
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        sc.close();
    }
}
