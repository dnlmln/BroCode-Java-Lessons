import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String name;
        double age;
        boolean isStudent;
        
        System.out.print("What is your name? ");
        name = sc.nextLine();

        System.out.print("How old are you? ");
        age = sc.nextDouble();

        System.out.print("Are you a student? ");
        isStudent = sc.nextBoolean();

        // Group 1 - for name
        if(name.isEmpty()){
            System.out.println("Please enter your name! 😡");
        }
        else{
            System.out.println("Hello " + name + "!" + "😉");
        }

        // Group 2 - for age
        if(age >= 65) {
            System.out.println("You are a senior! ");
        }
        else if(age >= 20) {
            System.out.println("You are an adult! ");
        }
        else if(age >= 13) {
            System.out.println("You are an teenager! ");
        }
        else if(age >= 2) {
            System.out.println("You are a child! ");
        }
        else if(age > 0) {
            System.out.println("You are an infant! ");
        }
        else if(age <= 0) {
            System.out.println("You haven't been born yet! ");
        }
        else {
            System.out.println("You are not human! ");
        }

        //Group 3

        if(isStudent == true) {
            System.out.println("You are a student! ");
        }
        else{
            System.out.println("You are not a student! ");
        }
       
        sc.close();
    }
}
