import java.util.Scanner;

public class Yeddanapudi_MadLibs {

    // Collects user input (adjective, noun, verb, etc.)
    public static String collectUserInput(String prompt, Scanner in) {
        System.out.print(prompt);
        return in.nextLine();
    }

    // Generates and displays a Mad Lib story based on a selected template
    public static void generateMadLibStory(String storyTemplate, String[] placeholders, String[] userInputs) {
        // Replace each placeholder in the story using String.replace()
        for (int i = 0; i < placeholders.length; i++) {
            storyTemplate = storyTemplate.replace(placeholders[i], userInputs[i]);
        }

        // Display the final modified Mad Lib
        System.out.println("\nHere's your completed Mad Lib story:\n");
        System.out.println(storyTemplate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Step 1: Let user choose a story ---
        System.out.println("Welcome to Mad Libs!");
        System.out.println("Choose a story template:");
        System.out.println("1. The Adventure");
        System.out.println("2. The School Day");
        System.out.println("3. The Dream Vacation");

        int choice = 0;
        boolean valid = false;

        // Fix: handle invalid or non-numeric input gracefully
        while (!valid) {
            System.out.print("Enter the number of your choice (1, 2, or 3): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline
                if (choice >= 1 && choice <= 3) {
                    valid = true;
                } else {
                    System.out.println("Please enter 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input — please enter a number!");
                scanner.nextLine(); // clear invalid input
            }
        }

        System.out.println();

        String storyTemplate = "";
        String[] placeholders;

        // --- Step 2: Pick the chosen story and define placeholders ---
        if (choice == 1) {
            storyTemplate = "Once upon a time, there was a [adj1] [noun1] who loved to [verb1]. "
                          + "One day, it met a [adj2] [noun2] that could [verb2]. "
                          + "They decided to go on an adventure to [place].";
            placeholders = new String[] {"[adj1]", "[noun1]", "[verb1]", "[adj2]", "[noun2]", "[verb2]", "[place]"};
        } else if (choice == 2) {
            storyTemplate = "It was a [adj1] morning at [place]. "
                          + "[name] grabbed their [noun1] and ran to class. "
                          + "The teacher asked everyone to [verb1] before lunch. "
                          + "Later, the [adj2] students couldn’t stop [verb2].";
            placeholders = new String[] {"[adj1]", "[place]", "[name]", "[noun1]", "[verb1]", "[adj2]", "[verb2]"};
        } else {
            storyTemplate = "During summer break, I went to [place]. "
                          + "The weather was [adj1] and the [noun1] was perfect. "
                          + "Every day I would [verb1] and eat [noun2]. "
                          + "It was the most [adj2] trip ever!";
            placeholders = new String[] {"[place]", "[adj1]", "[noun1]", "[verb1]", "[noun2]", "[adj2]"};
        }

        // --- Step 3: Prompt user for inputs to replace placeholders ---
        String[] userInputs = new String[placeholders.length];
        for (int i = 0; i < placeholders.length; i++) {
            String part = placeholders[i].replace("[", "").replace("]", ""); // clean up name
            userInputs[i] = collectUserInput("Enter a " + part + ": ", scanner);
        }

        // --- Step 4: Generate and display final story ---
        generateMadLibStory(storyTemplate, placeholders, userInputs);

        // --- Step 5: Example Test Cases (for rubric Part B) ---
        // Test 1 → Choose 1: brave, knight, fight, silly, dragon, dance, castle
        // Test 2 → Choose 2: sunny, Hogwarts, Harry, wand, study, sleepy, laugh
        // Test 3 → Choose 3: Hawaii, breezy, ocean, swim, pineapple, relaxing
    }
}
