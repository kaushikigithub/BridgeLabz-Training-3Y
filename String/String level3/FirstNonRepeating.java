import java.util.Scanner;

public class FirstNonRepeating {

    public static char firstNonRepeatingChar(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < text.length(); j++) {
                if (i != j && text.charAt(j) == c) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) return c;
        }
        return '\0';  // null char if none
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        char result = firstNonRepeatingChar(text);
        if (result == '\0') System.out.println("No non-repeating character found.");
        else System.out.println("First non-repeating character: " + result);
    }
}
