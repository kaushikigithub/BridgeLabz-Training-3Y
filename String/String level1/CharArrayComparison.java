import java.util.Scanner;

public class CharArrayComparison {
    // Method to return char array using charAt()
    public static char[] toCharArrayUsingCharAt(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] userArray = toCharArrayUsingCharAt(str);
        char[] builtInArray = str.toCharArray();

        boolean result = compareCharArrays(userArray, builtInArray);

        System.out.println("Comparison result: " + result);
    }
}

