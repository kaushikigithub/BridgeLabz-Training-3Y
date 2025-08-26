import java.util.Scanner;

public class TrimSpaces {
    // Method to find start and end indices without spaces
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indices = findTrimIndices(text);
        String userTrimmed = substringUsingCharAt(text, indices[0], indices[1]);
        String builtInTrimmed = text.trim();

        System.out.println("User-defined trim: '" + userTrimmed + "'");
        System.out.println("Built-in trim: '" + builtInTrimmed + "'");
        System.out.println("Are they equal? " + compareStrings(userTrimmed, builtInTrimmed));
    }
}
