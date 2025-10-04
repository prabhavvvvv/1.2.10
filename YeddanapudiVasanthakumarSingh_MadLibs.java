import java.util.Scanner;

public class SimpleMadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mad Libs!");
        System.out.println("Choose a story template:");
        System.out.println("1. The Adventure");
        System.out.println("2. The School Day");
        System.out.println("3. The Dream Vacation");

        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.print("Enter 1, 2, or 3: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                System.out.println("Invalid input — enter a number!");
                scanner.nextLine();
            }
        }

        String story = "";

        if (choice == 1) {
            System.out.print("Enter an adjective: ");
            String adj1 = scanner.nextLine();
            System.out.print("Enter a noun: ");
            String noun1 = scanner.nextLine();
            System.out.print("Enter a verb: ");
            String verb1 = scanner.nextLine();
            System.out.print("Enter another adjective: ");
            String adj2 = scanner.nextLine();
            System.out.print("Enter another noun: ");
            String noun2 = scanner.nextLine();
            System.out.print("Enter another verb: ");
            String verb2 = scanner.nextLine();
            System.out.print("Enter a place: ");
            String place = scanner.nextLine();

            story = "Once upon a time, there was a " + adj1 + " " + noun1 + " who loved to " + verb1 + ". "
                  + "One day, it met a " + adj2 + " " + noun2 + " that could " + verb2 + ". "
                  + "They decided to go on an adventure to " + place + ".";
        } 
        else if (choice == 2) {
            System.out.print("Enter an adjective: ");
            String adj1 = scanner.nextLine();
            System.out.print("Enter a place: ");
            String place = scanner.nextLine();
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            System.out.print("Enter a noun: ");
            String noun1 = scanner.nextLine();
            System.out.print("Enter a verb: ");
            String verb1 = scanner.nextLine();
            System.out.print("Enter another adjective: ");
            String adj2 = scanner.nextLine();
            System.out.print("Enter another verb: ");
            String verb2 = scanner.nextLine();

            story = "It was a " + adj1 + " morning at " + place + ". "
                  + name + " grabbed their " + noun1 + " and ran to class. "
                  + "The teacher asked everyone to " + verb1 + " before lunch. "
                  + "Later, the " + adj2 + " students couldn't stop " + verb2 + ".";
        } 
        else {
            System.out.print("Enter a place: ");
            String place = scanner.nextLine();
            System.out.print("Enter an adjective: ");
            String adj1 = scanner.nextLine();
            System.out.print("Enter a noun: ");
            String noun1 = scanner.nextLine();
            System.out.print("Enter a verb: ");
            String verb1 = scanner.nextLine();
            System.out.print("Enter another noun: ");
            String noun2 = scanner.nextLine();
            System.out.print("Enter another adjective: ");
            String adj2 = scanner.nextLine();

            story = "During summer break, I went to " + place + ". "
                  + "The weather was " + adj1 + " and the " + noun1 + " was perfect. "
                  + "Every day I would " + verb1 + " and eat " + noun2 + ". "
                  + "It was the most " + adj2 + " trip ever!";
        }

        System.out.println("Here's your completed Mad Lib story: ");
        System.out.println(story);

        scanner.close();
    }
}
