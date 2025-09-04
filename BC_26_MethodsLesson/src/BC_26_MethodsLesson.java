public class BC_26_MethodsLesson {
    public static void main(String[] args) {

       // method = a block of reusable code that is executed when called ()

        String name = "Dan";
        int age = 20;

        // We are passing the variables name and age as an argument to the method.
        happyBday(name, age);

        // Square
        // double result = square(3);
        // System.out.println(result);
        System.out.println("Squared: " + square(3));

        // Cube
        System.out.println("Cubed: " + cube(3));

        // Full Name
        // System.out.println("Full Name: " + createFullName("Daniel", "Milani"));
        String fullName = createFullName("Daniel", "Milani");
        System.out.println("Full Name: " + fullName);

       // Age check
       if(ageCheck(age)){
           System.out.println("You may sign up!");
       }
       else{
           System.out.println("You must be 18");
       }


    }

    // We need to configure parameters in the method
    // in order allow the arguments (variables) to be passed into the method.
    static void happyBday(String name, int age){
        System.out.println("Happy bday to you.");
        System.out.printf("Happy bday dear %s. \n", name);
        System.out.printf("You look %d. \n", age);
        System.out.println("You belong in a zoo. \n");
    }

    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }

    static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
       if(age >= 18){
           return true;
       }
       else{
           return false;
       }
    }
}
