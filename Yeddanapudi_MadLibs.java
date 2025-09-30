import java.util.Scanner;

public class Yeddanapudi_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adj1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adj2 = scanner.nextLine();

        System.out.print("Enter another noun:");
        String noun2 = scanner.nextLine();

        System.out.print("Enter another verb: ");
        String verb2 = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.println("Once upon a time, there was a " + adj1 + " " + noun1 + " who loved to " + verb1 + ". ");
        System.out.println("One day, it met a " + adj2 + " " + noun2 + " that could " + verb2 + ". ");
        System.out.println("They decided to go on an adventure to " + place + " together. ");

        scanner.close();
    }

}
