public class Job09 {
    public static void main(String[] arg) {
        int number = 1234;

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