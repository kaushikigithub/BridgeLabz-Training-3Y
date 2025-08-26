import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Reverse string
    public static boolean isPalindrome1(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    // Logic 2: Compare chars from both ends
    public static boolean isPalindrome2(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // Logic 3: StringBuilder reverse
    public static boolean isPalindrome3(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();

        System.out.println("Palindrome check (Logic 1): " + isPalindrome1(word));
        System.out.println("Palindrome check (Logic 2): " + isPalindrome2(word));
        System.out.println("Palindrome check (Logic 3): " + isPalindrome3(word));
    }
}
