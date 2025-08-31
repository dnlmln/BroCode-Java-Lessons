import java.util.Scanner;
public class BC_20_LogicalOperatorProject {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // &&   And = All statements must be true for the code to be executed.
        // ||   Or  = If at least one statement is true the code is executed.
        // !    Not = reverses a boolean

        // username must be between 4 and 12 characters.
        // username must not contain space " " or underscores "_"

        String username;

        System.out.print("Enter your username: ");
        username = sc.nextLine();

        //if( username.length() >= 4 && username.length() <= 12 && !username.contains(" ") && !username.contains("_")){
        //    System.out.println("Valid username: " + username);
        //}
        //else{
        //    System.out.println("No Bueno: " + username);
        //}

        if( username.length() < 4 || username.length() > 12 ){
            System.out.println("Invalid username: " + username);
            System.out.println("Username must be between 4-12 characters.");
        }
        else if( username.contains(" ") || username.contains("_") ){
            System.out.println("Invalid username: " + username);
            System.out.println("Username contains invalid characters.");
        }
        else{
            System.out.println("Username is valid.");
        }

        sc.close();
    }
}
