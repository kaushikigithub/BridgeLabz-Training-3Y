import java.util.Scanner;

public class CharFrequencyNested {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Count frequency with nested loops
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // Initialize frequency

            if (chars[i] == '0') // Already counted
                continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Store result in 1D String array
        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[i] = chars[i] + " -> " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (String s : frequencies) {
            if (s != null) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
