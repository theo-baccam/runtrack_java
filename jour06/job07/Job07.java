import java.util.Scanner;
import java.util.Arrays;


public class Job07 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = inputScanner.nextInt();
        };

        double average = Arrays.stream(array).average().orElse(0);
        System.out.printf("La moyenne est %.2f %n", average);
    }
}