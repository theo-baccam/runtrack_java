import java.util.Scanner;


public class CountUp {
    public static void main(String[] arg) {
        Scanner intParser = new Scanner(System.in);

        System.out.println("Give an integer: ");
        int userInt = intParser.nextInt();

        for (int i = 1; i <= userInt; i++) {
            System.out.println(i);
        };
    }
}