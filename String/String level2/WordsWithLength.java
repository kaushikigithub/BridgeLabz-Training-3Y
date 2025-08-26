import java.util.Scanner;

public class WordsWithLength {
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

    // Method to split text into words
    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text);
        int spaceCount = 0;

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

    // Method to return 2D array with words and their lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] wordsWithLength = getWordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : wordsWithLength) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
