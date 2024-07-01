public class Job11 {
    public static void main(String[] arg) {
        int factorial = 1;
        for (int i = 1; i <= 8; i++) {
            factorial *= i;
        }

        System.out.printf("La factorielle de 8 est %d %n", factorial);
    }
}