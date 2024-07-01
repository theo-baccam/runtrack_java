import java.util.Scanner;


public class Job10 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int age = inputScanner.nextInt();
        if (age < 18) {
            System.out.println("Vous etes mineur");
        } else {
            System.out.println("Vous etes majeur");
        };
    }
}