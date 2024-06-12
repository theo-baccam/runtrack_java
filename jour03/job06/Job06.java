import java.util.concurrent.ThreadLocalRandom;


public class Job06 {
    public static final int MIN_INT = -2147483648;
    public static final int MAX_INT = 2147483647;

    public static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(MIN_INT, MAX_INT);
    }

    public static void main(String[] arg) {
        final int INTEGER_SIZE = 10;

        int[] randomIntegerArray = new int[INTEGER_SIZE];

        for (int i = 0; i < INTEGER_SIZE; i++) {
            randomIntegerArray[i] = getRandomNumber();
        };

        for (int number : randomIntegerArray) {
            System.out.println(number);
        }
    }
}