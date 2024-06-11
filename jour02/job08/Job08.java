import java.util.Scanner;


public class Job08 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Give an integer");

        int numero = inputScanner.nextInt();
        int digits = 0;

        int tmp = numero;
        while (tmp >= 1) {
            tmp /= 10;
            digits += 1;
        };

        System.out.printf("%d has %d digits%n", numero, digits);
    }
}