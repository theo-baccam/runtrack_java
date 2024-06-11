public class Job10 {
    public static void main(String[] arg) {
        int number = 1234;
        int sum = 0;

        int tmp = number;
        while (tmp >= 1) {
            sum += (tmp % 10);
            tmp /= 10;
        };

        System.out.printf("La somme des chiffres est: %d", sum);
    }
}