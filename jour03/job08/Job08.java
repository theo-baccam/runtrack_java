import java.util.ArrayList;
import java.util.Collections;


public class Job08 {
    public static ArrayList<Integer> flattenIntegerMatrix(int[][] matrix) {
        ArrayList<Integer> flatIntegerMatrix = new ArrayList<Integer>();

        for (int[] y : matrix) {
            for (int x : y) {
                flatIntegerMatrix.add(x);
            };
        };

        return flatIntegerMatrix;
    }

    public static int[][] arrayListIntoMatrix(
        ArrayList<Integer> flatArray, int ySize, int xSize
    ) {
        int[][] matrix = new int[ySize][xSize];

        int y = 0;
        for (int[] row : matrix) {
            int x = 0;
            for (int column : row) {
                matrix[y][x] = flatArray.get(x + (y * ySize));
                x++;
            };
            y++;
        };

        return matrix;
    }

    public static void main(String[] arg) {
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.printf("%d ", tableau[y][x]);
            };
            System.out.println();
        };

        ArrayList<Integer> flatMatrix = flattenIntegerMatrix(tableau);
        Collections.sort(flatMatrix);

        tableau = arrayListIntoMatrix(flatMatrix, 3, 3);

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.printf("%d ", tableau[y][x]);
            };
            System.out.println();
        };
    }
}