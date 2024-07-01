import java.util.Scanner;


public class Job15 {
    public static int getLength(int n) {
        int length = 0;

        do {
            n /= 10;
            length += 1;
        } while (n >= 1);

        return length;
    }
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int number = inputScanner.nextInt();
        int reversedNumber = 0;
        int digit = 0;

        for (int i = getLength(number) - 1; i >= 0; i--) {
            int leftmost = number;
            for (int j = 0; j < i; j++) {
                leftmost /= 10;
            };
            leftmost %= 10;

            if (digit == 0) {
                reversedNumber += leftmost;
            } else {
                reversedNumber += leftmost * Math.pow(10, digit);
            }
            digit += 1;
        }

        System.out.println(reversedNumber);
    }
}