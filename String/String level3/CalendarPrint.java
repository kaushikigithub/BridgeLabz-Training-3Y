import java.util.Scanner;

public class CalendarPrint {

    public static void printCalendar(int days, int startDay) {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int current = 0;
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
            current++;
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            current++;
            if (current % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days in month: ");
        int days = sc.nextInt();

        System.out.print("Enter starting day (0=Sun, 1=Mon,...6=Sat): ");
        int startDay = sc.nextInt();

        printCalendar(days, startDay);
    }
}

