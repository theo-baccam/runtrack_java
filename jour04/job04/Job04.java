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
        int i = 1;
        for (i = i; i < maxNumber; i++) {};
        long endTime = System.currentTimeMillis();

        System.out.printf(
            "It took %d ms to increment to %d%n",
            endTime - startTime, i
        );
    }
}