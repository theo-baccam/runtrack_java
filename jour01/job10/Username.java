import java.util.Scanner;


public class Username {
    public static void main(String[] arg) {
        Scanner stringParser = new Scanner(System.in);

        System.out.println("Give your first name:");
        String firstName = stringParser.nextLine();
        firstName = firstName.concat(" ");

        System.out.println("Give your last name:");
        String lastName = stringParser.nextLine();

        System.out.printf("Your full name is %s", firstName.concat(lastName));
    }
}