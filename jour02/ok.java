import java.util.ArrayList;


public class Cars {
    public static void main(String[] arg) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Mazda");

        for (String car : cars) {
            System.out.println(car);
        }
    }
}