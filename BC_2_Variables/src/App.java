public class App {
    public static void main(String[] args) {
        
        // Primitive Variables: int, double, char, boolean
        // Reference Variables: string, array, object


        // Declaration
        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
       
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Daniel Milani";

        System.out.print("Your age is: " + age + " \n" );
        System.out.print("The year is: " + year + " \n");
        System.out.print("The quantity is: " + quantity + " \n" );

        System.out.println("Your price is: " + "$" + price );

        System.out.println("Your grade is: " + grade );
        System.out.println("Your price is: " + currency + price );

        System.out.println(isStudent);

        if(isStudent == true){
            System.out.println("Your are a student");
        }
        else{
            System.out.println("Your are NOT a student");
        }

        System.out.println("Hello " + name);
    }
}
