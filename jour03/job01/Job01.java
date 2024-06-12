public class Job01 {
    public static void main(String[] arg) {
        int[] tableau = new int[5];
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        int i = 0;
        for (int number : tableau) {
            System.out.printf("%d: %d%n", i, number);
            i++;
        };
    }
}