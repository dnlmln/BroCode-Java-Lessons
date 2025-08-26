public class BC_10_printf {
    public static void main(String[] args) throws Exception {

        // prinf() = is a method used to format output
        // %[flags}][width].[.precision][specifier-character]

        // Specifier Characters
        // For String   variables use a: %s
        // For char     variables use a: %c
        // For int      variables use a: %d
        // For double   variables use a: %f
        // For boolean  variables use a: %b

        System.out.println("\n" + "### printf: Specifier Characters ###" + "\n");

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s. \n", name );
        System.out.printf("Your name starts with the letter %c. \n", firstLetter);
        System.out.printf("You are %d years old. \n", age);
        System.out.printf("You are %f inches tall.\n", height);
        System.out.printf("Employed: %b \n", isEmployed);

        System.out.printf("%s is %d years old.\n", name, age);

        // Precision
        // %[flags}][width].[.precision][specifier-character]
        // precision: inserting .2 after % rounds to 2 decimal places.
    
        System.out.println("\n" + "### printf: Precision ###" + "\n");

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.2f \n", price1);
        System.out.printf("%.2f \n", price2);
        System.out.printf("%.2f \n", price3);

        // flags
        // %[flags}][width].[.precision][specifier-character]
        // + = output a plus
        // , = comma grouping separator for 1000's . 1000.00
        // ( = negative numbers are enclosed (). -5 becomes (5)
        // space = display a minus if negative, space if positive. Positive numbers are preceeded with a space.

        System.out.println("\n" + "### printf: Flags ###" + "\n");

        double price11 = 9000.99;
        double price12= 100000.15;
        double price13 = -54000.01;
        double price14 = -54000.01;

        System.out.printf("%.2f \n", price11);
        System.out.printf("%,.2f \n", price11);
        System.out.printf("%+,.2f \n", price12);
        System.out.printf("% ,.2f \n", price12);
        System.out.printf("%,.2f \n", price13);
        System.out.printf("% ,.2f \n", price13);
        System.out.printf("%(,.2f \n", price14);
        

        // width
        // %[flags}][width].[.precision][specifier-character]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        System.out.println("\n" + "### printf: width ###" + "\n");

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //pad with 0 to 4 places
        System.out.printf("%04d \n", id1);
        System.out.printf("%04d \n", id2);
        System.out.printf("%04d \n", id3);
        System.out.printf("%04d \n", id4);
        // Right Justify
        System.out.printf("%4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%4d \n", id3);
        System.out.printf("%4d \n", id4);
        // Left Justify
        System.out.printf("%-4d \n", id1);
        System.out.printf("%-4d \n", id2);
        System.out.printf("%-4d \n", id3);
        System.out.printf("%-4d \n", id4);

    }
}
