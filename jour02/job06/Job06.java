public class Job06 {
    public static void main(String[] arg) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) sum += i;
        };

        System.out.printf(
            "La somme des nombres pairs entre 1 et 100 est : %d%n", sum
        );
    }
}