public class BC_9a_MathClass {
    public static void main(String[] args) throws Exception {

        // PI
        System.out.println(Math.PI);

        // Euler's Constant
        System.out.println(Math.E);

        // two (2) to the power of three(3)
        double result;
        result = Math.pow(2, 3);
        System.out.println(result);

        // abosolute value: distance away from zero. negative becomes positive. positive stays positive
        double result2;
        result2 = Math.abs(-5);
        System.out.println(result2);

        // square root
        double result3;
        result3 = Math.sqrt(16);
        System.out.println(result3);

        // rounding (rounds to the nearest whole number)
        double result4;
        result4 = Math.round(3.14);
        System.out.println(result4);

        // rounding up to the nearest whole number
        double result5;
        result5 = Math.ceil(3.14);
        System.out.println(result5);

        // rounding down to the nearest whole number
        double result6;
        result6 = Math.floor(3.99);
        System.out.println(result6);

        // MAX: find max between two numbers (variables)
        double result7;
        result7 = Math.max(10, 20);
        System.out.println(result7);

        // MIN: find min between two numbers (variables)
        double result8;
        result8 = Math.min(10, 20);
        System.out.println(result8);


    }
}