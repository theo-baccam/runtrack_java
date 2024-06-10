public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // printf here works pretty much the same as in C
        System.out.printf(
            "La valeur de num1 est %d et la valeur de num2 est %d.\n",
            num1, num2
        );

        int tmp = num1;
        num1 = num2;
        num2 = tmp;

        System.out.printf(
            "La valeur de num1 est %d et la valeur de num2 est %d.",
            num1, num2
        );
    }
}