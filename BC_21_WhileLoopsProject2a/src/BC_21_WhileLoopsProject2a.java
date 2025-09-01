import java.util.Scanner;

public class BC_21_WhileLoopsProject2a {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        // This code gets executed only when condition is met.
        while(age <= 0){
            System.out.print("Wrong age. Try again: ");
            age = sc.nextInt();
        }

        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}
