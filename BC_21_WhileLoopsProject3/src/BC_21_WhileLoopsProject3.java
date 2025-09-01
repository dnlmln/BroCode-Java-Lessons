import java.util.Scanner;
public class BC_21_WhileLoopsProject3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Option1:
        // Only works if you set the "number" variable to "0"
        // Condition is checked once before the user gets prompted.
        // Not the best choice in this scenario
        //
        //int number = 0;
        //while( number < 1 || number > 10 ){
        //    System.out.print("Enter a number between 1 and 10: ");
        //    number = sc.nextInt();
        //}     


        // While the number is less than 1 or greater than 10 execute code.
        // Option2:
        // The number variable is declared without assigning it a value.
        // Condition is checked only after user gets prompted.
        // Better for this scenario.
        
        int number;
        do{
            System.out.print("Enter a number between 1 and 10: ");
            number = sc.nextInt();
        }while( number < 1 || number > 10 );

        System.out.println("Your number is: " + number);

        sc.close();
    }
}
