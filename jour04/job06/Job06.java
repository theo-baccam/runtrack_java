import java.util.Scanner;


public class Job06 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.printf("What's the array's size? ");
        int arraySize = inputScanner.nextInt();

        int[] integerArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.printf("%d: ", i);
            integerArray[i] = inputScanner.nextInt();
        };

        int sum = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < arraySize; i++) {
            sum += integerArray[i];
        };
        long endTime = System.nanoTime();

        System.out.printf(
            "The sum is %d, it took %d nanoseconds to calculate%n",
            sum, endTime - startTime
        );
    }
}