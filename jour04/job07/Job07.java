package job07;

import java.util.Scanner;


public class Job07 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.printf("What's the array's size? ");
        int arraySize = inputScanner.nextInt();

        int[] integerArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.printf("%d: ", i);
            integerArray[i] = inputScanner.nextInt();
        };

        Sum s1 = new Sum(integerArray, 0, arraySize / 2);
        Sum s2 = new Sum(integerArray, arraySize / 2, arraySize);

        long startTime = System.nanoTime();
        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (InterruptedException e) {};
        long endTime = System.nanoTime();

        int sum = s1.sum + s2.sum;

        System.out.printf(
            "The sum is %d, it took %d nanoseconds to calculate%n",
            sum, endTime - startTime
        );
    }
}