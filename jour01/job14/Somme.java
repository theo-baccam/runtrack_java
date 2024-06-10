import java.util.Scanner;


public class Somme {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] arg) {
        Scanner intParser = new Scanner(System.in);

        System.out.println("Give a first number");
        int a = intParser.nextInt();

        System.out.println("Give a second number");
        int b = intParser.nextInt();

        System.out.printf("The sum of these two is %d", sum(a, b));
    }
}