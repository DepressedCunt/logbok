import java.util.Scanner;

public class logbook {
    public static void main(String[] args) {
        System.out.println("What do you want to do ?" + "\n" + "1. Show Journal" + "\n" + "2. Write in Journal");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if (answer.equals("1")) {
            System.out.println("test");
        }
    }
}
