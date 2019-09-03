import java.util.Scanner;

public class logbook {
    public static void main(String[] args) {
        int w = 1;
        while (w > 0) {
            PrintMenu();
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if (answer.equals("1")) {
                System.out.println("Journal");
               } else if (answer.equals("2")) {
                    System.out.println("Write Journal Post");
                } else if (answer.equals("3")) {
                    System.out.println("Edit Old Journal Post");
                } else if (answer.equals("4")) {
                    System.out.println("Saved Journal");
                } else if (answer.equals("5")) {
                    System.out.println("Read a Journal Post");
                } else if (answer.equals("6")) {
                    w = 0;
                }
            }
        }


    private static void PrintMenu() {
        System.out.println("What do you want to do ?" + "\n" + "1. Show Journal" + "\n" + "2. Write in Journal" + "\n" + "3. Edit an old post in the Journal" + "\n" + "4. Save Journal" + "\n" + "5. Read a Journal" + "\n" + "6. Exit");
    }
}
