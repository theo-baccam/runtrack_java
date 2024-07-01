import java.util.Scanner;


public class Job14 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int n = 0;
        do {
            System.out.println("Donnez un nombre inférieur ou égal à 9");
            n = inputScanner.nextInt();
        } while (n > 9);

        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d x %d = %d %n", n, i, n * i);
        }
    }
}