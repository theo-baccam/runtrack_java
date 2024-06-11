public class Job12 {
    public static void main(String[] arg) {
        int combinations = 0;
        for (int a = 1; a <= 6; a++) {
            for (int b = 1; b <= 6; b++) {
                for (int c = 1; c <= 6; c++) {
                    if (a <= b && b <= c) {
                        combinations += 1;
                        System.out.printf("%d %d %d%n", a, b, c);
                    };
                };
            };
        };

        System.out.printf("There are %d combinations", combinations);
    }
}