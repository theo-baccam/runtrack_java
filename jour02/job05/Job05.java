import java.util.Scanner;


public class Job05 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Donnez votre age:");
        int age = inputScanner.nextInt();

        if (age < 16) {
            System.out.println("Vous ne pouvez pas travailler.");
        } else if (age >= 67) {
            System.out.println("Vous etes en retraite.");
        } else if (age > 55) {
            System.out.println("Vous aurez du mal a trouver un emploi.");
        } else {
            System.out.println("Vous pouvez travailler.");
        };
    }
}