import java.util.Scanner;


public class stringSwapper {
    public static void main(String[] arg) {
        Scanner stringParser = new Scanner(System.in);

        System.out.println("Give a first string");
        String first = stringParser.nextLine();

        System.out.println("Give a second string");
        String second = stringParser.nextLine();

        // Substrings are pretty much string slices, in python it would be:
        // first += second
        // second = first[0:len(first) - len(second)]
        // first = first[len(second):]
        first = first + second;
        second = first.substring(0, (first.length() - second.length()));
        first = first.substring(second.length());

        System.out.printf(
            "The first string is now %s and the second string is now %s",
            first, second
        );
    }
}