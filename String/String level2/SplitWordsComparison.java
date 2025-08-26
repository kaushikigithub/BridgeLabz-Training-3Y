import java.util.Scanner;

public class SplitWordsComparison {
    // Method to find length without length()
    public static int getLength(String str) {
        int count = 0;
        try {
            for (;;) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Method to split words manually using charAt()
    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = word;
                word = "";
            } else {
                word += c;
            }
        }
        words[wordIndex] = word;
        return words;
    }

    // Method to compare two arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("Are both splits equal? " + result);
    }
}

