import java.util.Scanner;

public class YeddanapudiVasanthakumarSingh_MadLibs {
    // This is the method to get user input for a specific word type
    // returns the entered word
    // Scanner object and word type are passed as parameters
    public static String getWord(Scanner input, String wordType) {
        System.out.print("Enter a " + wordType + ": ");
        return input.nextLine();
    }

    // determines if a word starts with a vowel using indexOf
    public static String getArticle(String word) {
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(word.charAt(0)) != -1) {
            return "an";
        }
        return "a";
    }

    // This method generates the Mad Libs story using the provided words
    // returns the completed story
    // all the words as then passed as parameters
    public static String generateStory(String noun1, String noun2, String verb1, String adjective1, String adjective2, String place, String pluralNoun) {
        String article = getArticle(noun1);
    
        return "One " + adjective1 + " day, I went to the " + place + " with my best friend. We saw " + article + " " + noun1 + " that could " + verb1 + " faster than anything else! " +
            "It was so " + adjective2 + " that everyone stopped to watch. " + "Later, we bought some " + pluralNoun + " and carried them home in " + article + noun2 + ".";
    }

    // this is the main method function
    public static void main(String[] args) {
        Scanner madLib = new Scanner(System.in);
        // get user input for each word type
        String noun1 = getWord(madLib, "noun");
        String noun2 = getWord(madLib, "different noun");
        String pluralNoun = getWord(madLib, "different plural noun");
        String verb1 = getWord(madLib, "verb");
        String adjective1 = getWord(madLib, "adjective");
        String adjective2 = getWord(madLib, "different adjective");
        String place = getWord(madLib, "place");

        // build & show final story
        String madLibStory = generateStory(noun1, noun2, verb1, adjective1, adjective2, place, pluralNoun);

        System.out.println("Your Mad Libs Story: ");
        System.out.println(madLibStory);
    }
}
