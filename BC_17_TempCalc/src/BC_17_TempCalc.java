import java.util.Scanner;

public class BC_17_TempCalc {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celcius (C) or Fahrenheit (F)? ");
        //unit = sc.nextLine(); // next line
        //unit = sc.next();       // next character only
        unit = sc.next().toUpperCase();     // Method Chaining.

        // just for testing
        // System.out.println(temp);
        // System.out.println(unit);

        // ternary
        // (condition) ? true : false

        newTemp = (unit.contains("F")) ? ( ( temp * 9/5 ) + 32) : ( ( temp - 32 ) * 5 / 9 );

        System.out.printf("The value of %.2f converted to °%s is %.2f. \n",temp, unit, newTemp);

        sc.close();
    }
}
