import java.util.Scanner;


public class MinuteToHours {
    public static void main(String[] arg) {
        Scanner intParser = new Scanner(System.in);
        int minutes = intParser.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes - (hours * 60);

        System.out.printf(
            "%d est équivalent à %d heure(s) et %d minute(s).",
            minutes, hours, remainingMinutes
        );
    }
}