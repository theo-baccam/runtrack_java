public class Job03 {
    public static void main(String[] arg) {
        String[] nameArray = {"Josette", "John", "Myrtille", "Marc"};

        System.out.println(nameArray[1]);
        nameArray[2] = "Mireille";

        int i = 0;
        for (String name : nameArray) {
            System.out.printf("%d: %s%n", i, name);
            i++;
        };
    }
}