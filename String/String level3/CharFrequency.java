import java.util.Scanner;
import java.util.HashMap;

public class CharFrequency {

    // a. Using normal method
    public static void frequencyNormal(String text) {
        boolean[] visited = new boolean[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(text.charAt(i) + " -> " + count);
        }
    }

    // b. Using HashMap
    public static void frequencyHashMap(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }

    // c. Using Char Array
    public static void frequencyCharArray(String text) {
        int[] freq = new int[256];
        for (char c : text.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char) i + " -> " + freq[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Normal Method:");
        frequencyNormal(text);

        System.out.println("\nUsing HashMap:");
        frequencyHashMap(text);

        System.out.println("\nUsing Char Array:");
        frequencyCharArray(text);
    }
}
