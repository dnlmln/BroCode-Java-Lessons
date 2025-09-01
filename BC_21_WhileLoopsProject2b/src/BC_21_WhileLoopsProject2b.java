import java.util.Scanner;

public class BC_21_WhileLoopsProject2b {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int age;

        // This code runs at least once and keeps running as long as condition is met.
        do{
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        }while(age <= 0);

        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}
