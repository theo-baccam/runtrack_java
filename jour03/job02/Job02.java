public class Job02 {
    public static void displayArray(int[] monTableau) {
        int i = 0;
        for (int number : monTableau) {
            System.out.printf("%d: %d%n", i, number);
            i++;
        };
    }

    public static void main(String[] arg) {
        int[] monTableau = {12, 6, 76, 89};
        displayArray(monTableau);

        monTableau[0] = 92;
        monTableau[1] = 829;
        monTableau[2] = 12;
        monTableau[3] = 3;
        displayArray(monTableau);
    }
}