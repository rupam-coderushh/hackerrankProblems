import java.util.Calendar;
import java.util.Scanner;

public class problemscalendar {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day);

        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };

        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String result = findDay(month, day, year);

        System.out.println("Day: " + result);

        sc.close();
    }
}