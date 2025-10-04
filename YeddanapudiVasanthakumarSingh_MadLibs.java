import java.util.Scanner;
public class LastName_MadLibs {
    public static String getWord(Scanner input, String wordType) {
        System.out.print("Enter a " + wordType + ": ");
        return input.nextLine();
    }

    public static String generateStory(String noun1, String noun2, String verb1, String adjective1, String adjective2, String place, String pluralNoun) {

        return "One " + adjective1 + " day, I went to the " + place + " with my best friend. We saw a " + noun1 + " that could " + verb1 + " faster than anything else! " +
            "It was so " + adjective2 + " that everyone stopped to watch. " + "Later, we bought some " + pluralNoun +  " and carried them home in a " + noun2 + ".";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect user input for each word type
        String noun1 = getWord(input, "noun");
        String noun2 = getWord(input, "another noun");
        String verb1 = getWord(input, "verb");
        String adjective1 = getWord(input, "adjective");
        String adjective2 = getWord(input, "another adjective");
        String place = getWord(input, "place");
        String pluralNoun = getWord(input, "plural noun");

        // Build and display the final story
        String madLibStory = generateStory(noun1, noun2, verb1, adjective1, adjective2, place, pluralNoun);

        System.out.println("\nYour Mad Libs Story\n");
        System.out.println(madLibStory);

        input.close();
    }
}
