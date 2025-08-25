import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        // we declared the "width" variable to be a double so no need to do it again.
        width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        // we declared the "height" variable to be a double so no need to do it again.
        height = scanner.nextDouble();

        // we declared the "area" variable to be a double so no need to do it again.
        area = width * height;

        System.out.println("Your rectangle is " + width + " wide and " + height + " high.");
        System.out.println("Your rectangle has an area of " + area + " cm. sq.");

        scanner.close();
    }


}
