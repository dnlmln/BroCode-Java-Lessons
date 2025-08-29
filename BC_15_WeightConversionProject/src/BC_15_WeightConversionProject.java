import java.util.Scanner;

public class BC_15_WeightConversionProject {
    public static void main(String[] args) throws Exception {

        // Weight Conversion Program

        // Declare Variables.
        Scanner scanner = new Scanner(System.in);

        String selection;
        double weight;
        double result;

        // Welcome Message
        System.out.println("Weight Conversion Program");
        System.out.println("1: From lbs to kg");
        System.out.println("2: From kg to lbs");
        System.out.print("Make your selection:  ");

        selection = scanner.nextLine();

        // Option 1
        if(selection.contains("1")){
            System.out.println("You selected option 1 (lbs to kg).");
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            result = weight / 2.2;
            System.out.printf("The weight in kg is: %.2f \n", result);
        }
        // Option 2
        else if(selection.contains("2")){
            System.out.println("You selected option 2 (kg to lbs).");
            System.out.print("Enter the weight in kg: ");
            weight = scanner.nextDouble();
            result = weight * 2.2;
            System.out.printf("The weight in lb is: %.2f \n", result);
        }
        //Option 3
        else{
            System.out.println("Please choose 1 or 2.");
        }
        scanner.close();
    }
}
