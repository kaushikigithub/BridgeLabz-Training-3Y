import java.util.Scanner;

public class ShortestLongestWord {
    public static int getLength(String str) {
        int count = 0;
        try {
            for (;;) { str.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

    public static String[] splitUsingCharAt(String text) {
        int length = getLength(text), spaceCount = 0;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') spaceCount++;

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0; String word = "";
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') { words[wordIndex++] = word; word = ""; }
            else word += c;
        }
        words[wordIndex] = word;
        return words;
    }

    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordData) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < Integer.parseInt(wordData[minIndex][1])) minIndex = i;
            if (len > Integer.parseInt(wordData[maxIndex][1])) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] wordData = getWordsWithLength(words);
        int[] result = findShortestAndLongest(wordData);

        System.out.println("Shortest word: " + wordData[result[0]][0]);
        System.out.println("Longest word: " + wordData[result[1]][0]);
    }
}
