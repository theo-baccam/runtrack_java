import java.util.HashMap;


public class Jour04 {
    HashMap<Integer, Integer> occurences = new HashMap<Integer, Integer>();

    public boolean isNumberInOccurences(int number) {
        for (Integer occuringNumber : this.occurences.keySet()) {
            if (occuringNumber == number) {
                return true;
            };
        };

        return false;
    }

    public static void main(String[] arg) {
        Jour04 self = new Jour04();

        int[] integerArray = {3, 7, 3, 9, 8};

        for (int number : integerArray) {
            if (self.isNumberInOccurences(number)) {
                self.occurences.put(number, self.occurences.get(number) + 1);
            } else {
                self.occurences.put(number, 1);
            };
        };

        for (int occuringNumber : self.occurences.keySet()) {
            System.out.printf(
                "%d: %d%n",
                occuringNumber,
                self.occurences.get(occuringNumber)
            );
        };
    }
}