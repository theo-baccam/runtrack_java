import java.util.Scanner;


public class Job05 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.printf("Donnez un nombre: ");
        int number = inputScanner.nextInt();
        System.out.printf(
            "Le carre de %d est %.0f %n", number, Math.pow(number, 2)
        );
    }
}