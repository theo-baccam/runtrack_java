import java.util.Scanner;


public class Job11 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Give a positive integer:");
        int height = inputScanner.nextInt();

        String line = "";
        for (int i = 1; i <= height; i++) {
            line = line.concat("*");
            System.out.println(line);
        };
    }
}