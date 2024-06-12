public class Job07 {
    public static void main(String[] arg) {
        int[][] matrice1 = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };

        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.printf("%d ", matrice1[y][x]);
            };
            System.out.println();
        };

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                matrice1[y][x] += matrice2[y][x];
            };
        };

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.printf("%d ", matrice1[y][x]);
            };
            System.out.println();
        };
    }
}