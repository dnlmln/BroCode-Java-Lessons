import java.util.Scanner;

public class BC_9b_MathClass_Hypotenuse {
    public static void main(String[] args) throws Exception {

        // Hypotenuse c = Math.sqrt(a² + b²)
        
        // Create new Scanner object
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Let's calculate the Hypotenuse of a triangle");

        System.out.print("Enter length of side a: ");
        a = sc.nextDouble();

        System.out.print("Enter length of side b: ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The length of the hypotenuse (side c) is: " + c);

        sc.close();
    }
}
