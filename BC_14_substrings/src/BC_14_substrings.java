import java.util.Scanner;

public class BC_14_substrings {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // .substring() =   A method used to extract a portion of a stringl
        //                  string.substring(start, end)

        String email;
        String username;
        String domain;

        System.out.print("Enter your email? ");
        //String email = "daniel.milani@gmail.com";
        email = scanner.nextLine();

        // .substring based on character position
        // String username1 = email.substring(0, 13);
        // String domain1 = email.substring(14);
        // System.out.println(username1);
        // System.out.println(domain1);

        if(email.isEmpty()){
            System.out.println("Please enter an Email!");
        }
        else{
            if(email.contains("@")){
                System.out.println("Valid email detected.");

                // Using .indexof with .substring to find the position of the "@"
                username = email.substring(0, email.indexOf("@"));
                domain = email.substring(email.indexOf("@") + 1);

                System.out.printf("Your username is: %s \n", username);
                System.out.printf("Your domain is:   %s \n", domain);
            }
            else{
                System.out.println("Your email must contain a \"@\".");
            }

        }
        scanner.close();
    }
}
