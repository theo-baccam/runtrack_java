import java.util.Scanner;


public class Job06 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        final int ARRAY_LENGTH = 3;
        int[] array = new int[ARRAY_LENGTH];

        System.out.println("Donnez trois nombres entiers: ");

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int number = inputScanner.nextInt();
            array[i] = number;
        };

        int firstGreatest = array[0];
        for (int n : array) {
            if (n > firstGreatest) firstGreatest = n;
        }

        System.out.printf("Maximum: %d %n", firstGreatest);
    }
}