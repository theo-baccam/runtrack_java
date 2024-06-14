// It is slightly faster with threads than without 

package job03;


import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;


public class Job03 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int stringLength;
        do {
            System.out.printf("Give a positive integer: ");
            stringLength = inputScanner.nextInt();
        } while (stringLength <= 0);

        int firstHalf = stringLength / 2;
        int secondHalf = stringLength - firstHalf;

        long startTime;
        try {
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            RandomString rs1 = new RandomString(fileOut, firstHalf);
            RandomString rs2 = new RandomString(fileOut, secondHalf);

            startTime = System.currentTimeMillis();
            rs1.start();
            rs2.start();

            rs1.join();
            rs2.join();
            long endTime = System.currentTimeMillis();

            fileOut.close();

            System.out.printf(
                "It took %d ms to generate %d random characters%n",
                endTime - startTime, stringLength
            );
        } catch (IOException e) {
        } catch (InterruptedException e) {};
    }
}