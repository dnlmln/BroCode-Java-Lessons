import java.util.Scanner;

public class BC_21_WhileLoopsProject1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String response = "";

        // This code gets executed only when condition is met.
        while( !response.equalsIgnoreCase("q") ){
            System.out.println("Let's play a game.");
            System.out.print("Hit the \"Q\" key quit: ");
            //nextLine() will return an empty string if Enter is pressed. 
            response = sc.nextLine();
            //
            //next() will wait for a non-whitespace character even if Enter is pressed. 
            //response = sc.next().toUpperCase();
        }

        System.out.println("You have quit the game.");

        sc.close();
    }
}
