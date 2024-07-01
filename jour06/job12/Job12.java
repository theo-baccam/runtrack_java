import java.util.Scanner;


public class Job12 {
    public static long getFactorial(int n) {
        long factorial = 1;
        if (n == 0) return factorial;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        };

        return factorial;
    }

    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();

        System.out.printf("La factorielle de %d est %d %n", n, getFactorial(n));
    }
}