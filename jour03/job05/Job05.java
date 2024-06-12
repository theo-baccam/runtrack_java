import java.util.ArrayList;


public class Jour05 {
    ArrayList<Integer> uniqueIntegers = new ArrayList<Integer>();

    public boolean isNumberUnique(int number) {
        for (int integer : uniqueIntegers) {
            if (integer == number) {
                return false;
            };
        };

        return true;
    }

    public static void main(String[] arg) {
        Jour05 self = new Jour05();

        int[] integerArray = {3, 7, 3, 9, 8};

        for (int number : integerArray) {
            if (self.isNumberUnique(number)) self.uniqueIntegers.add(number);
        };

        System.out.println(self.uniqueIntegers);
    }
}