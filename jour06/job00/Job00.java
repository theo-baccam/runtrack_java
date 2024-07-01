public class Job00 {
    public static void main(String[] arg) {
        char c = 'c';
        String s = "string";
        int i = 42;
        long l = 300000000;
        float f = (float) 0.00193;
        boolean b = true;

        System.out.printf(
            """
            %c
            %s
            %d
            %d
            %f
            %b %n""",
            c, s, i, l, f, b
        );

        int TOTO = (int) 3.817;
        System.out.println(TOTO);

        // Nous pouvons constater, que lorsqu'on convertit un float à un integer
        // le nombre est arrondi vers le bas
    }
}