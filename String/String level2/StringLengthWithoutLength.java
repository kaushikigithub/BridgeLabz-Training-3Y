import java.util.Scanner;

public class StringLengthWithoutLength {
    // Method to calculate length without length() method
    public static int getLength(String str) {
        int count = 0;
        try {
            for (;;) { // infinite loop
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when charAt() goes out of bound, stop counting
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int userDefinedLength = getLength(str);
        int builtInLength = str.length();

        System.out.println("User-defined length: " + userDefinedLength);
        System.out.println("Built-in length: " + builtInLength);
    }
}

