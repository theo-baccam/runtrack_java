import java.util.Scanner;


public class Job09 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Give an integer:");
        int number = inputScanner.nextInt();

        int firstDigit = number;
        int tmp = number;
        while (tmp >= 1) {
            firstDigit = tmp;
            tmp /= 10;
        };

        int lastDigit = number % 10;

        System.out.printf("""
            Le premier chiffre de %d est : %d
            Le dernier chiffre de %d est : %d""",
            number, firstDigit, number, lastDigit
        );
    };
}