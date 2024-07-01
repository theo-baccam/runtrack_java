public class Job08 {
    public static void main(String[] arg) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        };

        System.out.printf("La somme des 100 premiers entiers est %d %n", sum);
    }
}