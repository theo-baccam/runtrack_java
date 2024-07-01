import java.util.Scanner;


public class Job09 {
    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);

        int n = inputScanner.nextInt();

        int cubeSum = 0;
        for (int i = 1; i <= n; i++) {
            cubeSum += Math.pow(i, 3);
        };

        System.out.printf("La somme des %d premiers cubes est %d %n", n, cubeSum);
    }
}