import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            System.out.println(count + " " + line);

            count++;
        }

        sc.close();
    }
}