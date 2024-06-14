package job05;


import java.util.Scanner;


public class Job05 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int maxNumber;
        do {
            System.out.printf("Please give a positive integer: ");
            maxNumber = inputScanner.nextInt();
        } while (maxNumber <= 0);

        Counter c1 = new Counter(1, maxNumber / 2);
        Counter c2 = new Counter(1, maxNumber - (maxNumber / 2));

        long startTime = System.currentTimeMillis();
        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {};
        long endTime = System.currentTimeMillis();

        System.out.printf(
            "It took %d ms to increment to %d%n",
            endTime - startTime, c1.startingNumber + c2.startingNumber
        );
    }
}