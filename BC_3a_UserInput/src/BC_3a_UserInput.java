import java.util.Scanner;

public class BC_3a_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Are you a student? (true or false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        if(isStudent == true){

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name );
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is: " + gpa );

        }
        else{

        System.out.println("Hello " + name );
        System.out.println("You are " + age + " years old.");

        }



        scanner.close();
    }
}
