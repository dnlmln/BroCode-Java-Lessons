import java.util.Scanner;

public class BC_9C_MathClass_Circle {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Circle Calculator (r = radius)
        // circumference = 2 * pi * r
        // area = pi * r²
        // volume = 4/3 * pi * r³

        double radius;
        double cirumference;
        double area;
        double volume;

        System.out.println("This program will calculate the circumference, area and volume of a circle.");
        System.out.print("What is the radius of your circle: ");
        radius = sc.nextDouble();

        //System.out.println(radius);

        // Calculating the cirumference
        cirumference = 2 * Math.PI * radius;
        System.out.println("The cirumference of your circle is: " + cirumference);


        // Calculating the area
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of your circle is: " + area);


        // Calculating the volume
        volume = 4/3 * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of your circle is: " + volume);


        sc.close();
    }
}
