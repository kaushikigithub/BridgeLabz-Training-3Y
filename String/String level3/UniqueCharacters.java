import java.util.Scanner;

public class UniqueCharacters {

    // Method to find string length (without length())
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int n = findLength(text);
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = c;
            }
        }

        // Trim result
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUniqueChars(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}

