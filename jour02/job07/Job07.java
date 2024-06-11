import java.util.Scanner;


public class Job07 {
    public static long getFactorial(int n) {
        long factorial = 1;

        if (n == 0) {
            return factorial;
        };

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        };

        return factorial;
    }

    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Donnez un nombre entier positif:");
        int n = inputScanner.nextInt();

        System.out.printf("La factorielle de %d est: %d", n, getFactorial(n));
    }
}