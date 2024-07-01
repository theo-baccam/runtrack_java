import java.util.Scanner;


public class Job13 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        };
    }
}