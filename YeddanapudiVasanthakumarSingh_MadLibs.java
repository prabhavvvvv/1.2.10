import java.util.Scanner;

public class YeddanapudiVasanthakumarSingh_MadLibs {
    // This function collects the user input whether it be an adjective, noun, verb, or place
    // Input is returned as a string

    public static String collectUserInput(String prompt, Scanner in) {
        System.out.print(prompt);
        return in.nextLine();
    }

    // The previous function collected a list of the previous inputs
    // This function generates the madlib story using those inputs
    // The completed story is then printed as a string

    public static void generateMadLibStory(String adj1, String noun1, String verb1, String adj2, String noun2, String verb2, String place) {
        System.out.println("\nHere's your Mad Libs story:");
        System.out.println("Once upon a time, there was a " + adj1 + " " + noun1 + " who loved to " + verb1 + ".");
        System.out.println("One day, they met a " + adj2 + " " + noun2 + " that could " + verb2 + ".");
        System.out.println("They decided to go on an adventure to " + place + " together.");
    }

    // The main function runs the program
    // It collects the user inputs and generates the madlib story

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // collect words from the user
        String adj1  = collectUserInput("Enter an adjective: ", scanner);
        String noun1 = collectUserInput("Enter a noun (name of person): ", scanner);
        String verb1 = collectUserInput("Enter a verb (present-tense): ", scanner);
        String adj2  = collectUserInput("Enter another adjective: ", scanner);
        String noun2 = collectUserInput("Enter another noun (name of person): ", scanner);
        String verb2 = collectUserInput("Enter another verb (present-tense): ", scanner);
        String place = collectUserInput("Enter a place: ", scanner);

        generateMadLibStory(adj1, noun1, verb1, adj2, noun2, verb2, place);
    }
}
