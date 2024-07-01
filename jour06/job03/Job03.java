public class Job03 {
    public static void main(String[] arg) {
        final int TABLE_LENGTH = 10;
        int[] array = new int[TABLE_LENGTH];

        for (int i = 0; i < TABLE_LENGTH; i++) {
            array[i] = i;
        };

        System.out.printf(
            """
            index 0: %d
            index 1: %d
            index 5: %d
            index 9: %d
            index 10: Donnera une erreur ArrayIndexOutOfBoundsException %n""",
            array[0], array[1], array[5], array[9]
        );
    }
}