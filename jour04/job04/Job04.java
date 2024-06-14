import java.util.Scanner;


public class Job04 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int maxNumber;
        do {
            System.out.printf("Give a positive integer: ");
            maxNumber = inputScanner.nextInt();
        } while (maxNumber <= 0);

        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= maxNumber; i++) {};
        long endTime = System.currentTimeMillis();

        System.out.printf("It took %d ms to run%n", endTime - startTime);
    }
}