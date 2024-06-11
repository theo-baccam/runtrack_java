import java.util.Scanner;


public class Job03 {
    public static void main(String[] arg) {
        Scanner intParser = new Scanner(System.in);

        System.out.println("Donnez un nombre entier");
        int number = intParser.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        };
    }
}