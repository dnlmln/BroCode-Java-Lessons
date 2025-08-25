import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Mad Libs Game


        String adjective1;  // describes something fast slow cheap expensive
        String noun1;       // person place or thing
        String adjective2;  //
        String verb1;       // action like sleeping or running
        String adjective3;  //

        System.out.print("What will your first adjective (description) be:");
        adjective1 = scanner.nextLine();
        System.out.print("What will your first noun (animal or person) be:");
        noun1 = scanner.nextLine();
        System.out.print("What will your second adjective (description) be:");
        adjective2 = scanner.nextLine();
        System.out.print("What will your first verb be (action ending in -ing):");
        verb1 = scanner.nextLine();
        System.out.print("What will your third adjective (description) be:");
        adjective3 = scanner.nextLine();


        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit i saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}
