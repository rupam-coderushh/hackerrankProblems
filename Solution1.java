import java.util.*;
import java.text.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // US Locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        // India Locale (custom locale)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        // China Locale
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France Locale
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}