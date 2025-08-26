import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) 
            System.out.println("They are Anagrams.");
        else 
            System.out.println("Not Anagrams.");
    }
}
