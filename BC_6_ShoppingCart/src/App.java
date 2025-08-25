import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String item_name;
        double item_price;
        int item_quantity;
        boolean purchase_confirmation;
        double item_total;

        System.out.println("\n\n\n\n\n");
        System.out.println("###################################################################");
        System.out.println("#                                                                 #");
        System.out.println("#  Welcome to DanMart where we aim to please your produce needs!  # ");
        System.out.println("#                                                                 #");
        System.out.println("###################################################################");
        System.out.println("\n\n");

        System.out.print("What pruduce item would you like to buy today? ");
        item_name = sc.nextLine();

        System.out.println("");

        System.out.print("How many " + item_name + " would you like to buy? ");
        item_quantity = sc.nextInt();

        System.out.println("");
        System.out.print("How much does each " + item_name + " cost? ");
        item_price = sc.nextDouble();

        System.out.println("");

        System.out.println("You want to purchase " + item_quantity + " " + item_name + " for " + item_price + " each." );

        System.out.println("");

        System.out.print("Is this correct? (true / false)");
        purchase_confirmation = sc.nextBoolean();

        System.out.println("");

        if( purchase_confirmation == true)
        {
            System.out.println("You agreed to purchase "  + item_quantity + " " + item_name + " for " + item_price + " each.");

            item_total = item_quantity * item_price;

            System.out.println("");

            System.out.println("You total for this purchase is: "  + item_total );
            //System.out.println("You total for this purchase is: "  + String.format("%.2f", item_total));
            System.out.println("");
            System.out.println("Thanks for shopping at DanMart. Come again!!!");
            System.out.println("\n\n");

        }
        else{
            System.out.println("");
            System.out.println("Sorry you changed your mind.");
            System.out.println("\n\n");
        }

        sc.close();
    }
}
