import java.util.Scanner;

public class YeddanapudiVasanthakumarSingh_MadLibs {
    // Requirement: Implements algorithm(s) that process user input
    public static String collectUserInput(String prompt, Scanner in) {
        System.out.print(prompt);
        return in.nextLine();
    }

    // Requirement: Implements algorithm(s) with String methods to parse for placeholders
    public static void generateMadLibStory(String storyTemplate, String[] placeholders, String[] userInputs) {
        for (int i = 0; i < placeholders.length; i++) {
            storyTemplate = storyTemplate.replace(placeholders[i], userInputs[i]);
        }

        // Requirement: Displays the final modified Mad Lib
        System.out.println("\nHere's your completed Mad Lib story:\n");
        System.out.println(storyTemplate);
    }

    // Helper to make prompts user-friendly
    public static String expandPart(String part) {
        return switch (part) {
            case "adj1", "adj2" -> "adjective";
            case "noun1", "noun2" -> "noun";
            case "verb1", "verb2" -> "verb";
            case "place" -> "place";
            case "name" -> "name (person)";
            default -> part;
        };  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Requirement: Prompts to keep the user on track
        System.out.println("Welcome to Mad Libs!");
        System.out.println("Choose a story template:");
        System.out.println("1. The Adventure");
        System.out.println("2. The School Day");
        System.out.println("3. The Dream Vacation");

        int choice = 0;
        boolean valid = false;

        // Input validation
        while (!valid) {
            System.out.print("Enter the number of your choice (1, 2, or 3): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (choice >= 1 && choice <= 3) {
                    valid = true;
                } else {
                    System.out.println("Please enter 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input — please enter a number!");
                scanner.nextLine(); // clear buffer
            }
        }

        String storyTemplate;
        String[] placeholders;

        // Requirement: Implements algorithm(s) with String methods to parse for sections to include
        switch (choice) {
            case 1 -> {
                storyTemplate = "Once upon a time, there was a [adj1] [noun1] who loved to [verb1]. "
                            + "One day, it met a [adj2] [noun2] that could [verb2]. "
                            + "They decided to go on an adventure to [place].";
                placeholders = new String[] {"[adj1]", "[noun1]", "[verb1]", "[adj2]", "[noun2]", "[verb2]", "[place]"};
            }
            case 2 -> {
                storyTemplate = "It was a [adj1] morning at [place]. "
                            + "[name] grabbed their [noun1] and ran to class. "
                            + "The teacher asked everyone to [verb1] before lunch. "
                            + "Later, the [adj2] students couldn't stop [verb2].";
                placeholders = new String[] {"[adj1]", "[place]", "[name]", "[noun1]", "[verb1]", "[adj2]", "[verb2]"};
            }
            case 3 -> {
                storyTemplate = "During summer break, I went to [place]. "
                            + "The weather was [adj1] and the [noun1] was perfect. "
                            + "Every day I would [verb1] and eat [noun2]. "
                            + "It was the most [adj2] trip ever!";
                placeholders = new String[] {"[place]", "[adj1]", "[noun1]", "[verb1]", "[noun2]", "[adj2]"};
            }
            default -> throw new IllegalStateException("Unexpected choice: " + choice);
        }

        // Collect user inputs
        String[] userInputs = new String[placeholders.length];
        for (int i = 0; i < placeholders.length; i++) {
            String part = placeholders[i].replace("[", "").replace("]", "");
            userInputs[i] = collectUserInput("Enter a " + expandPart(part) + ": ", scanner);
        }

        // Generate story
        generateMadLibStory(storyTemplate, placeholders, userInputs);
    }
}
