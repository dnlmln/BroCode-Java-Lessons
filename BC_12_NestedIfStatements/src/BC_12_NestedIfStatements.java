import java.util.Scanner;

public class BC_12_NestedIfStatements {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean isStudent;  // 10% discount
        boolean isSenior;   // 20% discount
        double price = 9.99;
        double studentDiscount = 10;
        double seniorDiscount = 20;

        System.out.print("Are you a student (true/false)? ");
        isStudent = sc.nextBoolean();
        System.out.print("Are you a senoir (true/false)? ");
        isSenior = sc.nextBoolean();

        if(isStudent){

            if(isSenior){

            System.out.printf("You will get a student discount of %.2f%% and a senoir discound of %.2f%%.\n", studentDiscount, seniorDiscount);
            price = price * ( ( 100 - studentDiscount ) / 100) * ( ( 100 - seniorDiscount) / 100);
            System.out.printf("You will pay $%.2f for your ticket.", price);

            }
            else{

            System.out.printf("You will get a student disount of %.2f%%.\n", studentDiscount);
            price = price * ( ( 100 - studentDiscount ) / 100);
            System.out.printf("You will pay $%.2f for your ticket.", price);

            }

        }
        else{

            if(isSenior){

            System.out.printf("You will get a senoir discount of %.2f%%.\n", seniorDiscount);
            price = price * ( ( 100 - seniorDiscount ) / 100);
            System.out.printf("You will pay $%.2f for your ticket.", price);

            }
            else{

            System.out.println("You are a not get a student discount nor a senior discount.");
            System.out.printf("You will pay $%.2f for your ticket.", price);

            }

        }

        sc.close();
    }
}
