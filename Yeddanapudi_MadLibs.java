import java.util.Scanner;

public class Yeddanapudi_MadLibs {

    public static String collectInput(String prompt, Scanner in) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public static void generateStory(String adj1, String noun1, String verb1,
                                     String adj2, String noun2, String verb2,
                                     String place) {
        System.out.println("\nHere's your Mad Libs story:");
        System.out.println("Once upon a time, there was a " + adj1 + " " + noun1 + " who loved to " + verb1 + ".");
        System.out.println("One day, it met a " + adj2 + " " + noun2 + " that could " + verb2 + ".");
        System.out.println("They decided to go on an adventure at " + place + " together.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // collect words from the user
        String adj1  = collectInput("Enter an adjective: ", scanner);
        String noun1 = collectInput("Enter a noun: ", scanner);
        String verb1 = collectInput("Enter a verb: ", scanner);
        String adj2  = collectInput("Enter another adjective: ", scanner);
        String noun2 = collectInput("Enter another noun: ", scanner);
        String verb2 = collectInput("Enter another verb: ", scanner);
        String place = collectInput("Enter a place: ", scanner);

        generateStory(adj1, noun1, verb1, adj2, noun2, verb2, place);

        scanner.close(); 
}

