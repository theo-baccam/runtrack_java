package job02;


import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;


public class Job02 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int stringLength;
        do {
            System.out.printf("Give a positive integer: ");
            stringLength = inputScanner.nextInt();
        } while (stringLength <= 0);

        long startTime;
        try {
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            RandomString rs = new RandomString(fileOut);

            startTime = System.currentTimeMillis();
            for (int i = 0; i < stringLength; i++) {
                rs.appendRandomCharacter();
            };

            long endTime = System.currentTimeMillis();

            fileOut.close();

            System.out.printf(
                "It took %d ms to generate %d random characters%n",
                endTime - startTime, stringLength
            );
        } catch (IOException e) {}
    }
}